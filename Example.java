public class Example{
    
    
    public void timeExcersice(int hora, int minutos, String ampm){
        
        if (minutos != 10 || minutos != 11 || minutos != 12 || minutos != 13 || minutos != 14 || minutos != 15 || minutos != 30 || minutos !=  45){
            
            System.out.println("son" + getHora(hora) + " y " + getMinutos(minutos) + getUnidadMinutos(minutos) + " " + getDayNight(ampm)); 
            
            
        }
        
        else{
            System.out.println("son" + getHora(hora) + " y" + casosEspeciales(minutos) + " " + getDayNight(ampm));
        }
        
        
        
    };
    
    
    public String getHora(int hora){
        
        switch (hora){
            case 1:
              return (" la una");

            case 2:
              return (" las 2");

            case 3:
              return (" las tres");

            case 4:
              return (" las cuatro");

            case 5:
              return (" las cinco");

            case 6:
              return (" las seis");

            case 7:
              return (" las siete");

            case 8:
              return (" las ocho");
 
            case 9:
              return (" las nueve");

            case 10:
              return (" las diez");

            case 11:
              return (" las once");

            case 12:
              return (" las doce medio día");

        }
        
        return (" hora invalida");
        
        
    }
    
    public String getMinutos(int minutos){
        
        int numIntMinutos = minutos / 10; 
            
            switch (numIntMinutos){
                case 0:
                    return (getUnidadMinutos(minutos));
                
                case 1:
                    return (" dieci");

                case 2:
                    return (" veinti");

                case 3:
                    return (" treinta y");

                case 4:
                    return (" cuarenta y");

                case 5:
                    return (" cincuenta y");
                case 6:
                    return (" las seis");
                
            }
            return ("minutos no validos");
            
        
    }
    
    public String getUnidadMinutos(int minutos){
        
        int unidadMinutos = minutos %10;
        
        switch (unidadMinutos){
            case 0:
                return("cero");
            case 1:
              return ("uno");

            case 2:
              return ("dos");

            case 3:
              return ("tres");

            case 4:
              return ("cuatro");

            case 5:
              return ("cinco");

            case 6:
              return ("seis");

            case 7:
              return ("siete");

            case 8:
              return ("ocho");
 
            case 9:
              return ("nueve");

        }
        
        return ("jaja");
    }
    
    public String casosEspeciales(int minutos){
        
        while (minutos > 15){
            if (minutos == 10){
                return (" diez");
            }
            
            if (minutos == 11){
                return (" once");
            }
            if (minutos == 12){
                return (" doce");
            }
            if (minutos == 13){
                return (" trece");
            }
            if (minutos == 14){
                return (" catorce");
            }
        }
        if (minutos == 15){
                return (" cuarto");
            }
        if (minutos == 30){
                return (" media");
            }
        if (minutos == 45){
                return (" cuarenta y cinco");
            }
        return ("");
    }
    
    public String getDayNight(String tiempo){
        if (tiempo == "am"){
            return ("de la mañana");
        }
        
        else{
            return ("de la tarde");
        }
    }
    
    
    
     public static void main(String []args){
         
         Example ejem  = new Example();
         
         ejem.timeExcersice(12, 00, "pm");
         

     }
}
