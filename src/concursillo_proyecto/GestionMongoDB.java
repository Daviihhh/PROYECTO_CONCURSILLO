package concursillo_proyecto;

import java.util.*;
//crear conexion
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

public class GestionMongoDB {
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	private MongoCollection<Document> coleccionPreguntas;
	
	private static String tema;

	private static ArrayList<Document> preguntas = new ArrayList<>();
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args ) {
				
		String uri ="mongodb+srv://silviaaoelectromedicina_db_user:Iws7ME7tVmxBLz5P@cluster0.5bm4pak.mongodb.net/";
    // Conexión
		boolean salida = false;
		
		int dificultad = 0;
      String tematica = tema;
		
		
    try  { 
  	  
    	  MongoClient mongoClient = MongoClients.create(uri);// crea una conexion con mongoDB))
        
    	//Base de datos y colección
        MongoDatabase database = mongoClient.getDatabase("ProyectoModular");
        
        MongoCollection<Document> collectionUsuarios = database.getCollection("Usuarios");
        MongoCollection<Document> collectionPreguntas = database.getCollection("Preguntas");
        
        collectionPreguntas.find().into(preguntas);
        
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

    // ✅ Cierra la conexión cuando ya no se necesite
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

	public String getTema() {
		// TODO Auto-generated method stub
		return tema;
	}
	
}