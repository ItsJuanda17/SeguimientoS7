package model;

public class Gastos{

  private int contador=0;//Contador para llevar el numero de gastos
  private double[] gastos = new double [10];//Arreglo para almacenar los gastos , se solicitaba un tamanio maximo de 10

  public void ingresarGasto(double valor){
    if(contador<10){
        gastos[contador]= valor;
        contador++;
    }else{
        System.out.println("Ya no se pueden ingresar mas gastos");
    }
  }
  
  //Metodo para llevar el gasto total y poder calcular el promedio 
  public double gastoTotal(){
    double total= 0 ;

    for(int i = 0; i<contador ; i++){
        total += gastos[i];
    }
    return total;
  }

//Metodo para calcular el gasto promedio 
  public double promedio(){
    if(contador>0){
        return gastoTotal()/contador;
    }else{
        return 0;
    }
  }
  
}