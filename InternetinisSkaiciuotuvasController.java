


// Web controlleris, leidzia viduje naudoti @RequestMapping
// @RestController anotacija nurodo, jog pvz: String tipo rezultatas turetu buti ispazdinamas klientui
// toks koks yra, be pagrazinimu.

@RestController

// Zymi konfiguracijos komponenta viduje leidzia kurti "bean"  per metodus su @Bean anotacija
// Shi klases lygio anotacija nurodo Spring karkasui "Atspeti" kofiguracija
// Rementis priklausonubenis ( Jar bibliotekonis ) kurias progranuotaias
//Sive atveiu ji veikig kanty su main metodds
//utraukia projekta ( pom.xml
@EnableAutoCofiguration
public class InternetinisSkaiciuotuvasController {
    @RequestMaping(method = RequestMethod.GET, value = "/")
    public String skaiciuoti(@RequestParam HashMap<String ,String> skaiciai){
        // Per url penduodamas caktas ( kintanasis ) turi povadining ska
// Basal cakta ski istraukdaus cedksme pvz ( trakime zhactetedas Lvede
// Vadinass mums cedkia kenventueti
        //is String i Int kad pasksicivotumeme cezultata
        // pavyzdys http://localhost:8080/skaiciuoti?sk1=2&sk2=3&zenklas=*

        int sk1=Integer.parseInt(skaiciai.get("sk1"));
        int sk2=Integer.parseInt(skaiciai.get("sk2"));
        String zenklas = skaiciai.get("zenklas");
return sk1 + "" + sk2 +"" + zenklas;

// todo suskaiciuoti ir atspausdinti rezultata, nurodant bbz in ka
        int n1 = Integer.parseInt (numbers. get ("n1" ));
        int h2 = Integer.parseInt (numbers. get ("n2"));
        double result = 0;
        String operation = numbers.get ("operation");
        if (operation.equals ("+")) {
            result = n1 + n2;
        } else if (operation.equals ("-")) {
            result = n1 - n2;
        } else if (operation.equals ("*")) {
            result = n1 * n2;
        } else if (operation.equals ("/") && n2 == 0) {
                result = n1 / n2
    }
return n1 + " " + operation + " " + n2 + "" + "=" + result;

        // ApplicationContext yra interface skictes suteikti infornaciia apie aptikaciios konfiguracia.
         // Sivo atveiu naudoiona konfigurociia paimamo is *.xml. foild

       // ApplicationContext appContext = new ClassPathXmlApplicationContext ( configLocation: "beans. xml");
        // bean atitinka Singleton pattern
        //HelloWorld bean = (HelloWorld) appContext .getBean( name: "HelloWorld");
//return bean.getHello();
    }



    }
      /*  return "Internetinis Skaiciuotuvas <p>" +
                " Galimos operacijos:</br>" +
                "&nbsp;&nbsp; sudeti </br>"+
                "&nbsp;&nbsp; dauginti </br>"+
                "&nbsp;&nbsp; dalinti </br>"+
                "&nbsp;&nbsp; atimti </br></p>"+;

    /*}




}
