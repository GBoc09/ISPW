package com.example.applicazione;

public class logBean {
    /**
     * vanno controllati: il campo data  è stato rimpito nel formato MM/DD/YYYY
     * se nome e cognome sono solo caratteri
     * se all'interno della email è presente la @, il punto
     * se nella license number sono presenti solo numeri (VERIFICARE SUL BREVETTO SE è ALFANUMERICO)
     */
   /* static boolean valDate(String date){
        boolean ret = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        try {
            formatter.parse(date);
            ret = true;
            System.out.println("Valid date");
            return (ret);
        }
        catch (Exception e) {
            System.out.println("Invalid date");
            return(ret);

        }
    }
    private boolean valIdentity(String name, String surname){
        Integer check = 0;
        boolean ret = false;
        if(name.matches("^[\\w]+$") && surname.matches("^[\\w]+$")) {
            check = 0;
        } else {
            check += check;
        }
        if (check == 1) {
            return(ret);
        } else {
            ret = true;
            return (ret);
        }
    }*/

    /*private static boolean isValidEmail (String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }*/
}
