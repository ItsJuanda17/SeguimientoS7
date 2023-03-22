package model;

public class Usuario{

//Atributos de la clase 
    private String name;
    private String id;
    


 public Usuario(String aname , String aid){

    name=aname;
    id=aid;

 }
//Metodos de consulta 
 public String getName(){
    
    return name; 

 }

 public String getId(){

    return id;
 }

}
  