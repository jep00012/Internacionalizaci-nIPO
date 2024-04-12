/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservaTuMoto;

import java.util.ArrayList;
public class Datos {
    //array marcas moto
    private ArrayList<String> marcas = new ArrayList<String>(); //Array de marcas de moto
    private ArrayList<String> modelos = new ArrayList<String>(); //Array de modelos de moto
    private ArrayList<String> fechas = new ArrayList<String>(); //Array de fechas de reserva
    private ArrayList<ArrayList<String>> reservas = new ArrayList<ArrayList<String>>(); //Matriz de reservas (Modelo x Fechas)
    private ArrayList<ArrayList<String>> idiomas = new ArrayList<ArrayList<String>>(); //Matriz de internacionalización (Idioma x Frases)

    public Datos(){
        marcas.add("KTM");
        marcas.add("YAMAHA");
        marcas.add("DUCATI");
        marcas.add("KAWASAKI");

        modelos.add("DUKE 390");
        modelos.add("Z900");
        modelos.add("SUPERMOTARD 950 SP");
        modelos.add("MT 09");

        fechas.add("15/12/2023");
        fechas.add("16/12/2023");
        fechas.add("17/12/2023");
        
        reservas.add(new ArrayList<String>());
        reservas.get(0).add("DUKE 390");
        reservas.get(0).add("15/12/2023");
        reservas.get(0).add("16/12/2023");
        reservas.get(0).add("17/12/2023");
        
        reservas.add(new ArrayList<String>());
        reservas.get(1).add("Z900");
        reservas.get(1).add("15/12/2023");
        reservas.get(1).add("16/12/2023");
        
        
        reservas.add(new ArrayList<String>());
        reservas.get(2).add("SUPERMOTARD 950 SP");
        reservas.get(2).add("15/12/2023");

        reservas.get(2).add("17/12/2023");
        
        reservas.add(new ArrayList<String>());
        reservas.get(3).add("MT 09");

        reservas.get(3).add("16/12/2023");
        reservas.get(3).add("17/12/2023");

        idiomas.add(new ArrayList<String>());
        idiomas.get(0).add("Español");
        
        idiomas.get(0).add("RESERVAR");
        idiomas.get(0).add("Complete el formulario para reservar: ");
        idiomas.get(0).add("Nombre Completo:");
        idiomas.get(0).add("Correo Electronico:");
        idiomas.get(0).add("Telefono:");
        idiomas.get(0).add("Fecha:");
        idiomas.get(0).add("Contratos:");
        idiomas.get(0).add("Acepto recibir información adicional via email");
        idiomas.get(0).add("Acepto rebir la confirmación de mi reserva por mensaje en el movil");
        
        idiomas.get(0).add("KTM DUKE 390");
        idiomas.get(0).add("<html>nuevo aspecto agresivo respalda su característico comportamiento afilado, su potente motor de 399 cc y su avanzada tecnología.<html>");
        idiomas.get(0).add("<html> La KTM 390 DUKE recibe un impulso de 'autenticidad’ para 2024. Su nuevo aspecto agresivo respalda su característico comportamiento afilado, su  potente motor de 399 cc y su avanzada tecnología. Esta máquina  increíblemente ágil se siente igual de cómoda dominando las el infestado tráfico urbano que destrozando curvas en carreteras reviradas más abiertas... NO BULLSHIT! Esta máquina encarna realmente su alias de CORNER ROCKET.<p>32KW (44CV) <p> 6 marchas <p> ABS integrado<p> Carnet A2<html>");
        
        idiomas.get(0).add("KTM Z900");
        idiomas.get(0).add("<html>La Z900 representa el equilibrio ideal entre la sensaciones y la confianza y seguridad que ofrecen todas las ayudas electrónicas.<html>");
        idiomas.get(0).add("<html> La Kawasaki Z900 cuenta con un motor de 125 CV que brilla por las sensaciones que ofrece y por la rápida respuesta del acelerador. Es una naked con una electrónica muy desarrollada, con dos modos de motor y cuatro de conducción. Dispone igualmente de un control de tracción de tres niveles más uno desconectable con el que se sitúa como una de las motos de su segmento con mayor seguridad activa disponible.<p>92.2KW (125CV)<p>6 velocidades<p>ABS integrado<p>Carnet A<html>");
        
        idiomas.get(0).add("DUCATI SUPERMOTARD 950 SP");
        idiomas.get(0).add("<html>Perfecta para llevar al extremo el paso por curva y al mismo tiempo afrontar el tráfico urbano<html>");
        idiomas.get(0).add("<html>La Hypermotard 950 transmite ligereza y sencillez con sus líneas limpias y tensas. Las huellas del mundo de las carreras de motard son visibles en el escape doble alto, el perfil recto del asiento y las proporciones estrechas y aerodinámicas de la motocicleta, que insinúan una conducción ágil y llena de adrenalina incluso cuando está parada.<p> Motor Ducati Tesastretta 937 cc Euro5 <p> Chasis multitubular de acero <p> Horquilla Marzocchi de 45 mm <p> Carnet A<html>");
        
        idiomas.get(0).add("YAMAHA MT 09");
        idiomas.get(0).add("<html>Su motor de gran cilindrada y alto par de 890 cc y su ligero chasis de aluminio aportan un rendimiento emocionante.<html>");
        idiomas.get(0).add("<html>La familia MT tiene en la MT-09 una de sus monturas más excitantes gracias a su impresionante motor de tres cilindros con configuración \"crossplane\", su avanzada electrónica y su imagen afilada que en 2024 se actualiza para resultar todavía más impactante. Se mantiene la versión limitable para el carnet A2 con 47,6 CV a 6.000 rpm limitada y que pasa a 95,2 CV a 9.000 rpm cuando se deslimita.<p> Sonido más deportivo <p> Quickshifter de tercera generación <p> Carnet A<html>");
        
        idiomas.get(0).add("<html>RESERVA REALIZADA CON EXITO<html>");
        idiomas.get(0).add("<html>ERROR FALTA UN CAMPO POR COMPLETAR<html>");
        
        idiomas.get(0).add("MARCA");
        idiomas.get(0).add("MODELO");
        idiomas.get(0).add("FECHA");
        
        idiomas.get(0).add("Ventana");
        idiomas.get(0).add("Acciones");
        idiomas.get(0).add("Tamaño Ventana");
        idiomas.get(0).add("500x500");
        idiomas.get(0).add("1080x1920");
        idiomas.get(0).add("Color Fondo");
        idiomas.get(0).add("gris");
        idiomas.get(0).add("negro");
        idiomas.get(0).add("descargar");
        
        //ingles
        idiomas.add(new ArrayList<String>());
        idiomas.get(1).add("Ingles");
        
        idiomas.get(1).add("RESERVATION");
        idiomas.get(1).add("Complete the form to make a reservation: ");
        idiomas.get(1).add("Full name:");
        idiomas.get(1).add("Email:");
        idiomas.get(1).add("Telefone:");
        idiomas.get(1).add("Date:");
        idiomas.get(1).add("Contracts:");
        idiomas.get(1).add("I agree to receive additional information via email");
        idiomas.get(1).add("I agree to receive confirmation of my reservation by mobile phone message");
        
        idiomas.get(1).add("KTM DUKE 390");
        idiomas.get(1).add("<html>new aggressive looks support its distinctive sharp performance, powerful 399 cc engine and advanced technology.<html>");
        idiomas.get(1).add("<html> The KTM 390 DUKE gets an 'authenticity' boost for 2024. Its aggressive new look backs up its characteristically sharp demeanor, powerful 399cc engine and advanced technology. This incredibly nimble machine is equally at home dominating the city's traffic-infested streets as it is tearing up corners on twisty, more open roads... NO BULLSHIT! This machine truly embodies its CORNER ROCKET moniker.<p>32KW (44hp) <p>6-speed <p>integrated ABS<p> A2 license<html>");
    
        idiomas.get(1).add("KTM Z900");
        idiomas.get(1).add("<html>The Z900 represents the ideal balance between sensation and the confidence and safety offered by all the electronic aids.<html>");
        idiomas.get(1).add("<html> The Kawasaki Z900 has a 125 hp engine that shines for the sensations it offers and for the quick throttle response. It is a naked with a highly developed electronics, with two engine modes and four driving modes. It also has a three-level traction control plus one that can be disconnected, making it one of the motorcycles in its segment with the most active safety available.<p>92.2KW (125hp)<p>6 speeds<p>ABS integrated<p>A<html>Carnet A<html>");
        
        idiomas.get(1).add("DUCATI SUPERMOTARD 950 SP");
        idiomas.get(1).add("<html>Perfect for extreme cornering and at the same time coping with urban traffic<html>");
        idiomas.get(1).add("<html>The Hypermotard 950 conveys lightness and simplicity with its clean, taut lines. Traces of the motard racing world are visible in the high dual exhaust, the straight seat profile and the bike's narrow, aerodynamic proportions, which hint at an agile, adrenaline-filled ride even when stationary.<p> Ducati Tesastretta 937 cc Euro5 engine <p>Multi-tubular steel chassis <p>45 mm Marzocchi fork <p>Carnet A<html>");
        
        idiomas.get(1).add("YAMAHA MT 09");
        idiomas.get(1).add("<html>Its large displacement, high-torque 890 cc engine and lightweight aluminum chassis provide thrilling performance.<html>");
        idiomas.get(1).add("<html>The MT family has in the MT-09 one of its most exciting mounts thanks to its impressive three-cylinder engine with crossplane configuration, its advanced electronics and its sharp image that in 2024 is updated to be even more impressive. It maintains the version limitable for the A2 license with 47.6 hp at 6,000 rpm limited and that goes to 95.2 hp at 9,000 rpm when deslimitated.<p> Sportier sound <p>Third-generation Quickshifter</p> <p>Carnet A<html>");
        
        idiomas.get(1).add("<html>BOOKING SUCCESSFULLY COMPLETED<html>");
        idiomas.get(1).add("<html>ERROR ONE FIELD IS MISSING<html>");
        
        idiomas.get(1).add("BRAND");
        idiomas.get(1).add("MODEL");
        idiomas.get(1).add("DATE");
        
        idiomas.get(1).add("Window");
        idiomas.get(1).add("Actions");
        idiomas.get(1).add("Window Size");
        idiomas.get(1).add("500x500");
        idiomas.get(1).add("1080x1920");
        idiomas.get(1).add("Background color");
        idiomas.get(1).add("grey");
        idiomas.get(1).add("black");
        idiomas.get(1).add("download");
    }

    public ArrayList<String> getMarcas() {
        return marcas;
    }

    public ArrayList<String> getModelos() {
        return modelos;
    }

    public ArrayList<String> getFechas() {
        return fechas;
    }

    public ArrayList<ArrayList<String>> getReservas() {
        return reservas;
    }
    
    public ArrayList<ArrayList<String>> getIdiomas() {
        return idiomas;
    }
}
