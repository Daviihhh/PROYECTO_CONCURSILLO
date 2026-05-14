package concursillo_proyecto;

import java.util.*;
//crear conexion
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class GestionMongoDB {
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	private MongoCollection<Document> coleccionPreguntas;
	
	private static String tema;
	
	private int puntuacion = 0;
	private String dniUsuarioActual = "";
	private String contrasenaUsuarioActual = "";

	private static ArrayList<Document> preguntas = new ArrayList<>();
	
	static Scanner sc = new Scanner (System.in);
	
	public GestionMongoDB() {
	    String uri = "mongodb+srv://silviaaoelectromedicina_db_user:Iws7ME7tVmxBLz5P@cluster0.5bm4pak.mongodb.net/";
	    try {
	        mongoClient = MongoClients.create(uri);
	        database = mongoClient.getDatabase("ProyectoModular");
	        coleccionPreguntas = database.getCollection("Preguntas");
	        coleccionPreguntas.find().into(preguntas);
	        System.out.println("Preguntas cargadas: " + preguntas.size());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main (String [] args ) {
				
		String uri ="mongodb+srv://silviaaoelectromedicina_db_user:Iws7ME7tVmxBLz5P@cluster0.5bm4pak.mongodb.net/";
    // Conexión
		String tematica = tema;
		
		
    try  { 
        
         //hay que meterle valor al tema y a la dificultad, imagino que cuando haga el scanner, justo despues llamo al metodo??
        //las preguntas las voy a hacer en un do while hasta que falle y que le saque si gana con otro booleano
        //
		  ArrayList<Pregunta> preguntasConcursillo = new ArrayList<>();
        preguntasConcursillo = obtenerPreguntaAleatoria(tematica);
       /* // Leer usuarios
        System.out.println("--------------------- Usuarios mostrados--------------------- ");//comprobar con código programación

        FindIterable<Document> usuarios = collectionUsuarios.find();
        for (Document usuario : usuarios) {
            System.out.println(usuario.getString("nombre"));
        }
        
        // Leer preguntas
        System.out.println("--------------------- Preguntas mostradas--------------------- ");

        FindIterable<Document> preguntas = collectionPreguntas.find();
        for (Document pregunta : preguntas) {
            System.out.println(pregunta.getString("enunciado")+" Respuesta correcta: "+pregunta.getString("correcta"));
        }*/
        
   
    } catch (Exception e) {
        e.printStackTrace();
    }

	}//fin main
	
	public void guardarTema(String temaGuardar) {
		tema = temaGuardar;
	}
	
	public static ArrayList<Document> darLista(){
		return preguntas;
	}
	
    // ✅ Método de instancia, usa this.preguntas ya cargadas
    public static ArrayList<Pregunta> obtenerPreguntaAleatoria(String tematicaEleg) {

        // ✅ Comprobación antes de empezar
        if (preguntas == null || preguntas.isEmpty()) {
            System.err.println("ERROR: No hay preguntas cargadas en la base de datos.");
            return new ArrayList<>();
        }

        // Copia local para no destruir la lista original al hacer remove
        ArrayList<Document> preguntasDisponibles = new ArrayList<>(preguntas);
        ArrayList<Pregunta> concursillo = new ArrayList<>();
        int dificultadEleg = 1;

        for (int i = 1; i <= 10; i++) {
            if (i == 4) dificultadEleg++;
            else if (i == 7) dificultadEleg++;
            else if (i == 10) dificultadEleg++;

            // ✅ Filtra primero las que cumplen criterios
            final int difFinal = dificultadEleg;
            ArrayList<Document> candidatas = new ArrayList<>();
            for (Document d : preguntasDisponibles) {
                String tem = d.getString("tematica");
                Integer dif = d.getInteger("dificultad");
                if (dif != null && dif == difFinal &&
                    tem != null && tem.equals(tematicaEleg)) {
                    candidatas.add(d);
                }
            }

            // ✅ Si no hay candidatas para esa dificultad/temática, avisa y para
            if (candidatas.isEmpty()) {
                System.err.println("No hay preguntas de dificultad " + difFinal +
                                   " y temática '" + tematicaEleg + "'");
                break;
            }

            // ✅ Elige una aleatoria de las candidatas válidas
            int random = (int)(Math.random() * candidatas.size());
            Document doc = candidatas.get(random);

            String enunciado = doc.getString("enunciado");
            ArrayList<String> respuestas = (ArrayList<String>) doc.getList("respuestas", String.class);
            String correcta = doc.getString("correcta");
            String tematica = doc.getString("tematica");
            int dificultad = doc.getInteger("dificultad");

            concursillo.add(new Pregunta(enunciado, respuestas, correcta, tematica, dificultad));

            // ✅ Elimina solo de la copia local para no repetir
            preguntasDisponibles.remove(doc);
        }

        return concursillo;
    }
    
    
    private ArrayList<Pregunta> concursillo = new ArrayList<>();
    private int indicePreguntaActual = 0;
    
    private String nombreUsuarioActual = "";

    public void setNombreUsuarioActual(String nombre) {
        nombreUsuarioActual = nombre;
    }

    public String getNombreUsuarioActual() {
        return nombreUsuarioActual;
    }

    public void iniciarConcursillo(String tematicaEleg) {
        resetPuntuacion();
        concursillo = obtenerPreguntaAleatoria(tematicaEleg);
        indicePreguntaActual = 0;
    }
    
    public boolean existeDNI(String dni) {
        ArrayList<Document> docs = new ArrayList<>();
        database.getCollection("Usuarios").find().into(docs);
        
        for (Document doc : docs) {
            if (doc.getString("dni").equals(dni)) {
                return true;
            }
        }
        return false;
    }
    
    public int getNumPreguntaActual() {
        return indicePreguntaActual + 1;
    }
    

    public Pregunta getPreguntaActual() {
        if (indicePreguntaActual < concursillo.size()) {
            return concursillo.get(indicePreguntaActual);
        }
        return null;
    }

    public void siguientePregunta() {
        indicePreguntaActual++;
    }
    
    
    // ✅ Cierra la conexión cuando ya no se necesite
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
    
    public boolean iniciarSesion(String nombre, String contrasena) {
        ArrayList<Document> docs = new ArrayList<>();
        database.getCollection("Usuarios").find().into(docs);
        
        for (Document doc : docs) {
            if (doc.getString("nombre").equals(nombre) &&
                doc.getString("contrasena").equals(contrasena)) {
                return true; // usuario encontrado
            }
        }
        return false; // no encontrado
    }

	public String getTema() {
		// TODO Auto-generated method stub
		return tema;
	}
	
	public void sumarPunto() {
	    puntuacion++;
	}

	public int getPuntuacion() {
	    return puntuacion;
	}

	public void resetPuntuacion() {
	    puntuacion = 0;
	}
	
	public void setDniUsuarioActual(String dni) {
	    dniUsuarioActual = dni;
	}

	public void setContrasenaUsuarioActual(String contrasena) {
	    contrasenaUsuarioActual = contrasena;
	}

	public String getDniUsuarioActual() {
	    return dniUsuarioActual;
	}

	public String getContrasenaUsuarioActual() {
	    return contrasenaUsuarioActual;
	}
	
	public void guardarUsuario(Usuario usuario) {

	    try {

	        MongoCollection<Document> coleccionUsuarios =
	            database.getCollection("Usuarios");

	        // Buscar usuario por DNI
	        Document existente = coleccionUsuarios.find(
	            new Document("dni", usuario.getDNI())
	        ).first();

	        // SI NO EXISTE, INSERTAR
	        if(existente == null) {

	            Document doc = new Document()
	                .append("nombre", usuario.getNombre())
	                .append("dni", usuario.getDNI())
	                .append("contrasena", usuario.getPassword())
	                .append("puntuacion", usuario.getPuntuacion());

	            coleccionUsuarios.insertOne(doc);

	            System.out.println("Usuario creado");

	        } else {

	            // si existe, comparar puntuacion
	            int puntuacionActual =
	                existente.getInteger("puntuacion");

	            // Solo actualizar si mejora
	            if(usuario.getPuntuacion() > puntuacionActual) {

	                coleccionUsuarios.updateOne(
	                    new Document("dni", usuario.getDNI()),
	                    new Document("$set",
	                        new Document("puntuacion",
	                            usuario.getPuntuacion()
	                        )
	                    )
	                );

	                System.out.println("Nueva mejor puntuacion");

	            } else {

	                System.out.println("La puntuacion no mejora");
	            }
	        }

	    } catch(Exception e) {

	        e.printStackTrace();
	    }
	}

	
	public ArrayList<Usuario> getOrdenRanking() {

	    MongoCollection<Document> coleccionUsuarios = database.getCollection("Usuarios");

	    ArrayList<Document> lista = new ArrayList<>();
	    coleccionUsuarios.find().into(lista);

	    ArrayList<Usuario> usuarios = new ArrayList<>();

	    // Pasar documentos a usuarios
	    for (Document doc : lista) {

	        Usuario u = new Usuario(
	            doc.getString("nombre"),
	            doc.getString("dni"),
	            doc.getString("contrasena"),
	            doc.getInteger("puntuacion")
	        );

	        usuarios.add(u);
	    }

	    // Ordenar de mayor a menor puntuacion
	    usuarios.sort((u1, u2) ->
	        Integer.compare(u2.getPuntuacion(), u1.getPuntuacion())
	    );

	    // Crear lista top 5
	    ArrayList<Usuario> rankeds = new ArrayList<>();

	    for(int i = 0; i < 5 && i < usuarios.size(); i++) {

	        rankeds.add(usuarios.get(i));
	    }

	    return rankeds;
	}
	
}