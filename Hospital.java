/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import hospital.Pacientes;

/**
 *
 * @author Sebastian
 */
public class Hospital {
ArrayList<Pacientes> ListaP = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
           Hospital hospital = new Hospital();
                   hospital.Inic();
                   hospital.Opciones();
    }
    
    //Metodos para Pacientes
    public void InsertarP (){
        Pacientes pacientes = new Pacientes();
                pacientes.setId(JOptionPane.showInputDialog("Ingresa el id del nuevo paciente"));
                pacientes.setNombres(JOptionPane.showInputDialog("Ingresa el nombre del nuevo paciente"));
                pacientes.setApellidos(JOptionPane.showInputDialog("Ingresa los apellidos del nuevo paciente"));
                pacientes.setGenero(JOptionPane.showInputDialog("Ingresa el genero del nuevo paciente"));
                pacientes.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del nuevo paciente")));
        ListaP.add(pacientes);
               }
    
    public void EliminarP(){
        int op;
       op = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero de la lista desea remover?"));
    ListaP.remove(op);
        JOptionPane.showMessageDialog(null, "Paciente "+op+" eliminado con exito.");
    }
    public void ModificarP(){
        int op;
        Pacientes pacientes = new Pacientes();
        op = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero de la lista desea modificar?"));
        pacientes.setId(JOptionPane.showInputDialog("Ingresa el id del paciente"));
                pacientes.setNombres(JOptionPane.showInputDialog("Ingresa el nombre del paciente"));
                pacientes.setApellidos(JOptionPane.showInputDialog("Ingresa los apellidos del paciente"));
                pacientes.setGenero(JOptionPane.showInputDialog("Ingresa el genero del paciente"));
                pacientes.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del paciente")));
    ListaP.remove(op);
    ListaP.add(op, pacientes);
   }
    public void ConsultarP(){
        int i =1;
        Pacientes pacientes = new Pacientes();
        String lista="";
        JOptionPane.showMessageDialog(null, "A continuacion se imprimira en pantalla los pacientes en la lista");
         while(i<ListaP.size()){
        JOptionPane.showMessageDialog(null, i+".-\n    ID:"+ ListaP.get(i).getId()+"\n    Nombres:"+ListaP.get(i).getNombres()+"\n    Apellidos:"+ListaP.get(i).getApellidos()+"\n    Genero:"+ListaP.get(i).getGenero()+"\n    Edad:"+ListaP.get(i).getEdad() +".");
         i++;
         
         }
            
        

}
    public void Inic(){
       Pacientes pacientes = new Pacientes();
       pacientes.setId("______");
       pacientes.setNombres("_____");
       pacientes.setApellidos("______");
       pacientes.setGenero("______");
       pacientes.setEdad(0);
    ListaP.add(0, pacientes);
    }
    
    
    
    
    public void Opciones(){
    int opc;
        do{
           opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion: \n1.Insertar paciente.\n2.Eliminar paciente.\n3.Modificar paciente.\n4.Consultar pacientes.\n0.Cerrar"));
           switch(opc){
               case 1:InsertarP();
               break;
               case 2:EliminarP();
               break;
               case 3:ModificarP();
               break;
               case 4:ConsultarP();
               break;
                      
           
           }
           }while(opc !=0);     
    
    
    
    
    }
    
    
    
    

}