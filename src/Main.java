import accidentes.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void lanzarMenu(){
        System.out.println("-------------MENÚ------------------");
        System.out.println("1. Ingresar Info Carro");
        System.out.println("2. Ver Info Carros");
        System.out.println("3. Ingresar Info Dueño");
        System.out.println("4. Ver Info Dueños");
        System.out.println("5. Ingresar Info Incidente");
        System.out.println("6. Ver Info Incidentes");
        System.out.println("7. Ingresar Comentario");
        System.out.println("8. Ver Comentarios");
        System.out.println("9. Ingresar Marca");
        System.out.println("10. Ver Info Marcas");
        System.out.println("11. Salir");
    }

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Dueno> duenos = new ArrayList<>();
        ArrayList<Incidente> incidentes = new ArrayList<>();
        ArrayList<Marca> marcas = new ArrayList<>();
        ArrayList<String> paises = new ArrayList<>();
        ArrayList<Integer> conteoPaises = new ArrayList<>();
        ArrayList<String> comentarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Informacion inicial
            Marca toyota = new Marca(1, "toyota", "Japon");
            marcas.add(toyota);
            Marca ford = new Marca(2, "ford", "EEUU");
            marcas.add(ford);
            Marca bmw = new Marca(3, "bmw", "Alemania");
            marcas.add(bmw);

            Dueno d1 = new Dueno(1001, "Ana", "Gómez", "555-1111");
            Carro c1 = new Carro("ABC123", "Corolla", 2019);
            Incidente inc1 = new Incidente(101, "Choque frontal", new Date(), "555-1111");
            toyota.agregarCarro(c1);
            carros.add(c1);
            duenos.add(d1);
            c1.vincularDueno(d1);
            d1.agregarIncidente(inc1);
            incidentes.add(inc1);

            Dueno d2 = new Dueno(1002, "Luis", "Pérez", "555-2222");
            Carro c2 = new Carro("DEF456", "Camry", 2020);
            toyota.agregarCarro(c2);
            carros.add(c2);
            duenos.add(d2);
            c2.vincularDueno(d2);

            Dueno d3 = new Dueno(1003, "Marta", "Sánchez", "555-3333");
            Carro c3 = new Carro("GHI789", "RAV4", 2021);
            toyota.agregarCarro(c3);
            carros.add(c3);
            duenos.add(d3);
            c3.vincularDueno(d3);

            Dueno d4 = new Dueno(1004, "Carlos", "Díaz", "555-4444");
            Carro c4 = new Carro("JKL321", "Focus", 2018);
            ford.agregarCarro(c4);
            carros.add(c4);
            duenos.add(d4);
            c4.vincularDueno(d4);

            Dueno d5 = new Dueno(1005, "Laura", "Vargas", "555-5555");
            Carro c5 = new Carro("MNO654", "Mustang", 2021);
            Incidente inc2 = new Incidente(102, "Robo", new Date(), "555-5555");
            ford.agregarCarro(c5);
            carros.add(c5);
            duenos.add(d5);
            c5.vincularDueno(d5);
            d5.agregarIncidente(inc2);
            incidentes.add(inc2);

            Dueno d6 = new Dueno(1006, "Pedro", "Morales", "555-6666");
            Carro c6 = new Carro("PQR987", "Explorer", 2019);
            Incidente inc6 = new Incidente(106, "vuelco", new Date(), "3083465432");
            ford.agregarCarro(c6);
            carros.add(c6);
            duenos.add(d6);
            c6.vincularDueno(d6);
            d6.agregarIncidente(inc6);
            incidentes.add(inc6);

            Dueno d7 = new Dueno(1007, "Sofia", "Lopez", "555-7777");
            Carro c7 = new Carro("STU432", "F-150", 2020);
            Incidente inc3 = new Incidente(103, "Atropello", new Date(), "555-7777");
            ford.agregarCarro(c7);
            carros.add(c7);
            duenos.add(d7);
            c7.vincularDueno(d7);
            d7.agregarIncidente(inc3);
            incidentes.add(inc3);

            Dueno d8 = new Dueno(1008, "Jorge", "Ramírez", "555-8888");
            Carro c8 = new Carro("VWX213", "Serie 3", 2022);
            Incidente inc4 = new Incidente(104, "Colisión múltiple", new Date(), "555-8888"); // Jorge Ramírez
            bmw.agregarCarro(c8);
            carros.add(c8);
            duenos.add(d8);
            c8.vincularDueno(d8);
            d8.agregarIncidente(inc4);
            incidentes.add(inc4);

            Dueno d9 = new Dueno(1009, "Elena", "Fernández", "555-9999");
            Carro c9 = new Carro("YZA546", "X1", 2020);
            bmw.agregarCarro(c9);
            carros.add(c9);
            duenos.add(d9);
            c9.vincularDueno(d9);

            Dueno d10 = new Dueno(1010, "Luis", "García", "555-1212");
            Carro c10 = new Carro("BCD879", "Serie 5", 2021);
            Incidente inc5 = new Incidente(105, "Colisión trasera", new Date(), "555-1212"); // Luis García
            bmw.agregarCarro(c10);
            carros.add(c10);
            duenos.add(d10);
            c10.vincularDueno(d10);
            d10.agregarIncidente(inc5);
            incidentes.add(inc5);

            Dueno d11 = new Dueno(1011, "Ana", "Mendoza", "555-1313");
            Carro c11 = new Carro("EFG432", "X5", 2019);
            bmw.agregarCarro(c11);
            carros.add(c11);
            duenos.add(d11);
            c11.vincularDueno(d11);

            Dueno d12 = new Dueno(1012, "Mario", "Soto", "555-1414");
            Carro c12 = new Carro("HIJ765", "Z4", 2021);
            bmw.agregarCarro(c12);
            carros.add(c12);
            duenos.add(d12);
            c12.vincularDueno(d12);

            // Marca mas vendida
            Marca top = null;
            int maximoCarros = -1;
            int indexMarca = -1;

            for (int i = 0; i < marcas.size(); i++) {
                if (marcas.get(i).getCarros().size() > maximoCarros) {
                    maximoCarros = marcas.get(i).getCarros().size();
                    indexMarca = i;
                }
            }

            System.out.println("Marca más vendida " + marcas.get(indexMarca).getNombre());

            // Marca con más incidentes
            Marca topIncidentes = null;
            int maximoIncidentes = 0;
            int indexMarcaIncidentes = -1;

            for (int i = 0; i < marcas.size(); i++) {
                Marca marcaActual = marcas.get(i);
                int sumaIncidentes = 0;

                ArrayList carrosMarca = marcaActual.getCarros();
                for (int j = 0; j < carrosMarca.size(); j++) {
                    Carro carro = (Carro) carrosMarca.get(j);

                    ArrayList duenosCarro = carro.getDuenos();
                        for (int k = 0; k < duenosCarro.size(); k++) {
                            Dueno dueno = (Dueno) duenosCarro.get(k);
                            sumaIncidentes += dueno.getIncidentes().size();
                        }
                }
                if (sumaIncidentes > maximoIncidentes) {
                    maximoIncidentes = sumaIncidentes;
                    indexMarcaIncidentes = i;
                }
            }

                Marca masIncidentes = marcas.get(indexMarcaIncidentes);
                System.out.println("Marca con más incidentes " + masIncidentes.getNombre());


                // Pais más común
                for (int i = 0; i< carros.size(); i++){
                    Carro carro = carros.get(i);
                    Marca marca = carro.getMarca();
                    String pais = marca.getPais();

                    int k = -1;

                    for (int j = 0; j < paises.size(); j++){
                        if (paises.get(j).equals(pais)) {
                            k = j;
                            break;
                        }
                    }

                    if (k != -1){
                        int valorActual = conteoPaises.get(k);
                        conteoPaises.set(k, valorActual + 1);
                    } else {
                        paises.add(pais);
                        conteoPaises.add(1);
                    }

                }

        int maxPais = -1;
        int maxCarros = -1;
        for (int i = 0; i < conteoPaises.size(); i++) {
            if (conteoPaises.get(i) > maxCarros) {
                maxCarros = conteoPaises.get(i);
                maxPais = i;
            }
        }
        System.out.println("Pais más común " +paises.get(maxPais) + " con " + maxCarros + " carros");

        //Incidentes por dueño
        for (int i = 0; i < duenos.size(); i++ ){
            Dueno dueno = duenos.get(i);
            System.out.println("Dueño: " + dueno.getNombre());

            if (dueno.getIncidentes().size() > 0){
                System.out.println(dueno.mostrarIncidentes());
            } else {
                System.out.println("No tiene incidentes \n");
            }
        }

        // Menu
        boolean salir = false;
        lanzarMenu();
        int opcion = Integer.parseInt(sc.nextLine());

        while(!salir){
            switch(opcion){
            case 1:
                System.out.println("Ingrese la placa");
                String pl = sc.nextLine();
                System.out.println("Ingrese el modelo");
                String modelo = sc.nextLine();
                System.out.println("Ingrese el año");
                int anio = Integer.parseInt(sc.nextLine());

                System.out.println("Ingrese el id de la marca");
                for(int i=0; i< marcas.size(); i++){
                    System.out.println((i+1)+ "." + marcas.get(i).getNombre());
                }
                int opcionMarca = Integer.parseInt(sc.nextLine()) - 1;

                if (opcionMarca < marcas.size()){
                    Carro nCarro = new Carro(pl, modelo, anio);
                    nCarro.setMarca(marcas.get(opcionMarca));
                    carros.add(nCarro);
                } else {
                    System.out.println("O el id está mal diseñado, o sos vos");
                }
                break;

                case 2:
                    if (carros.isEmpty()){
                        System.out.println("No hay carros aún");
                        break;
                    }

                    for (int i = 0; i < carros.size(); i++){
                        Carro carro = carros.get(i);
                        System.out.println("Carro " + (i+1));
                        System.out.println("Placa: " + carro.getPlaca());
                        System.out.println("Año: " + carro.getAnioLanzamiento());
                        System.out.println("Modelo: " + carro.getModelo());
                        System.out.println("Dueño: " + carro.getDuenos() + "\n");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese la cedula del dueño: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese telefono");
                    String telefono = sc.nextLine();

                    Dueno nDueno = new Dueno(id, nombre, apellido, telefono);
                    duenos.add(nDueno);
                    break;

                case 4:
                    if (duenos.isEmpty()){
                        System.out.println("No hay dueños registrados");
                        break;
                    }

                    for(int i = 0; i < duenos.size(); i++){
                        Dueno dueno = duenos.get(i);
                        System.out.println("Dueño " + (i+1));
                        System.out.println("ID: " + dueno.getCedula());
                        System.out.println("Nombre: " + dueno.getNombre() + " " + dueno.getApellido());
                        System.out.println("Telefono: " + dueno.getTelefono());

                        System.out.println("Carros: " + dueno.getCarros());

                        ArrayList incidentesDueno = dueno.getIncidentes();
                        if(incidentesDueno.size() == 0) {
                            System.out.println("No tiene incidentes registrados \n");
                        } else {
                            System.out.println(dueno.getIncidentes() + "\n");
                        }
                        }

                case 5:
                    System.out.println("Ingrese el código del incidente");
                    int codigo = Integer.parseInt(sc.nextLine());

                    boolean codExiste = false;
                    for (int i=0; i < incidentes.size(); i++){
                        if (incidentes.get(i).getCodigo() == codigo){
                            codExiste = true;
                            System.out.println("Ya existe un incidente con ese código");
                            break;
                        }
                    }

                    System.out.println("Ingrese el tipo de incidente: ");
                    String tipo = sc.nextLine();

                    System.out.println("Ingrese número de contacto");
                    String tel = sc.nextLine();

                    System.out.println("Ingrese la opcion del dueño implicado en el accidente");
                    for(int i=0; i < duenos.size(); i++) {
                        Dueno d = duenos.get(i);
                        System.out.println((i+1) + ". Cedula: " + d.getCedula() +" - " + d.getNombre());
                    }
                    int opcionDueno = Integer.parseInt(sc.nextLine()) - 1;

                    if (opcionDueno >= 0 && opcionDueno < duenos.size()){
                        Incidente nIncidente = new Incidente(codigo, tipo, new Date(), tel);
                        Dueno duenoIncidenteT = duenos.get(opcionDueno);

                        duenoIncidenteT.agregarIncidente(nIncidente);
                        incidentes.add(nIncidente);

                        System.out.println("Incidente creado");
                        break;
                    } else {
                        System.out.println("Dueño invalido, vuelva a hacer el proceso");
                        break;
                    }

                case 6:
                    if (incidentes.isEmpty()) {
                        System.out.println("No hay incidentes registrados");
                        break;
                    }

                    for(int i = 0; i < incidentes.size(); i++){
                        Incidente incidente = incidentes.get(i);
                        System.out.println("Incidente " + (i+1));
                        System.out.println("Codigo: " + incidente.getCodigo());
                        System.out.println("Tipo: " + incidente.getTipoIncidente());
                        System.out.println("Fecha: " + incidente.getFechaIncidente());
                        System.out.println("Telefono: " + incidente.getTelefono());
                        System.out.println("Dueño: " + incidente.getDueno() + "\n");

                    }
                    break;

                case 7:
                    if (carros.isEmpty()){
                        System.out.println("No hay carros registrados para ingresar comentarios");
                        break;
                    }

                    System.out.println("Ingrese la placa del carro");
                    String plBus = sc.nextLine();

                    Carro carroEncontrado = null;
                    for(int i = 0; i < carros.size(); i++){
                        if (carros.get(i).getPlaca().equalsIgnoreCase(plBus)){
                            carroEncontrado = carros.get(i);
                            break;
                        }
                    }

                    if (carroEncontrado == null){
                        System.out.println("No se encontroun carro con esa placa");
                        break;
                    }

                    System.out.println("Ingrese el comentario");
                    String descripcion = sc.nextLine();

                    carroEncontrado.agregarComentario(descripcion, new Date());

                    System.out.println("Comentario agregado");
                    break;

                case 8:
                    if(carros.isEmpty()){
                        System.out.println("No hay comentarios disponibles");
                    }

                    System.out.println("Comentarios ");

                    for(int i = 0; i < carros.size(); i++){
                        Carro carro = carros.get(i);
                        String com = carro.mostrarComentariosCarro();

                        System.out.println(" Vehiculo:  " + carro.getPlaca() + " (" + carro.getModelo());
                        System.out.println("Comentarios");
                        System.out.println(com);
                    }


                case 9:
                    System.out.println("Ingrese el id de la marca: ");
                    int idm = Integer.parseInt(sc.nextLine());

                    boolean idExiste = false;
                    for (int i = 0; i < marcas.size(); i++){
                        if (marcas.get(i).getId() == idm){
                            idExiste = true;
                            System.out.println("Error, ya existe ese ID");
                            break;
                        }
                    }

                    System.out.println("Ingrese el nombre de la marca: ");
                    String nombrem = sc.nextLine();

                    System.out.println("Ingrese el pais de origen");
                    String paism = sc.nextLine();

                    Marca nMarca = new Marca(idm, nombrem, paism);
                    marcas.add(nMarca);

                    System.out.println("Marca Registrada con exito");

                case 10:
                    if (marcas.isEmpty()){
                        System.out.println("No hay marcas registradas");
                        break;
                    }

                    for (int i = 0; i < marcas.size(); i++){
                        Marca marca = marcas.get(i);
                        System.out.println(" Marca " + (i+1));
                        System.out.println("ID: " + marca.getId());
                        System.out.println("Nombre: " + marca.getNombre());
                        System.out.println("Pais de Origen: " + marca.getPais());
                        System.out.println("Cantidad de carros: " + marca.getCarros().size() + "\n");
                    }
                    break;

                case 11:
                    System.out.println("Dale suerteeeee");
                    System.exit(0);
                    salir = true;

                default:
                    System.out.println("Error de capa 8");
                    break;
            }
            lanzarMenu();
            opcion = Integer.parseInt(sc.nextLine());
        }
        }
}