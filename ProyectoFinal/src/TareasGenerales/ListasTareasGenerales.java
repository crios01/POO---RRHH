package TareasGenerales;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import Modelos.Tarea;

public class ListasTareasGenerales {

   private List<Tarea> listaTareasGenerales;
        
        public ListasTareasGenerales(){
                
                //Inicia constructor de listas Tareas Generales
                
                listaTareasGenerales = new ArrayList<Tarea>();
                
                Tarea tarea1 = new Tarea ("TG-001","Asunto1",new Timestamp(0),"Frank","Comentario1");
                Tarea tarea2 = new Tarea ("TG-002","Asunto2",new Timestamp(0),"Cesar","Comentario2");
                Tarea tarea3 = new Tarea ("TG-003","Asunto3",new Timestamp(0),"Abel","Comentario3");
                Tarea tarea4 = new Tarea ("TG-004","Asunto4",new Timestamp(0),"Zamora","Comentario4");
                
                listaTareasGenerales.add(tarea1);
                listaTareasGenerales.add(tarea2);
                listaTareasGenerales.add(tarea3);
                listaTareasGenerales.add(tarea4);
        }

        public List<Tarea> getListaTareasGenerales() {
                return listaTareasGenerales;
        }

        public void setListaTareasGenerales(List<Tarea> listaTareasGenerales) {
                this.listaTareasGenerales = listaTareasGenerales;
        }
        
        //Fin constructor de listas Tareas Generales    


}