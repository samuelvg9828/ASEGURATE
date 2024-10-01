package org.example;

import org.example.Modelos.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        Asegurado aseguradoUno = new Asegurado();
        Asegurado aseguradoDos = new Asegurado("Alejandro","Jaramillo","123321",LocalDateTime.now(),"carrera 23 21 2","Medellin","236521","2587737","alejandro@gmail.com","Masculino","Soltero","Estudiante","Vida",1000000,false);

        Vehiculo vehiculoUno =new Vehiculo();
        Vehiculo vehiculoDos =new Vehiculo("Mazda","2005",LocalDateTime.now(),"ASM123","Negro","Sedan","12345",24000,true,"Extra",4,"Alejandro",LocalDateTime.now(),false,24000000);

        Accidente accidenteUno =new Accidente();
        Accidente accidenteDos =new Accidente(LocalDateTime.now(),"5:00","Guayabal","Siniestro","Sedan","AZX231","Andres","1236541","Sura",true);

        Aseguradora aseguradoraUno =new Aseguradora();
        Aseguradora aseguradoraDos=new Aseguradora("Sura","Sura","102365214","carrera 45 32 12","258963","sura@gmail.com","www.sura.com.co","Colombia","Variado",LocalDateTime.now());

        Beneficiario beneficiarioUno =new Beneficiario();
        Beneficiario beneficiarioDos =new Beneficiario("Samuel","Valbuena","1254120",LocalDateTime.now(),"Amigo","carrera 34 54 3","2587737","samuel@gmail.com",25,true);

        System.out.println(aseguradoUno);
        System.out.println(aseguradoDos);

        System.out.println(vehiculoUno);
        System.out.println(vehiculoDos);

        System.out.println(accidenteUno);
        System.out.println(accidenteDos);

        System.out.println(aseguradoraUno);
        System.out.println(aseguradoraDos);

        System.out.println(beneficiarioUno);
        System.out.println(beneficiarioDos);


        Asegurado asegurado = new Asegurado();
        System.out.println("Ingrese el nombre del asegurado:");
        asegurado.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido del asegurado:");
        asegurado.setApellido(scanner.nextLine());
        System.out.println("Ingrese el número de identificación:");
        asegurado.setNumeroIdentificacion(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (yyyy-mm-dd hh:mm):");
        asegurado.setFechaNacimiento(LocalDateTime.parse(scanner.nextLine() + "T00:00"));
        System.out.println("Ingrese la dirección:");
        asegurado.setDireccion(scanner.nextLine());
        System.out.println("Ingrese la ciudad:");
        asegurado.setCiudad(scanner.nextLine());
        System.out.println("Ingrese el código postal:");
        asegurado.setCodigoPostal(scanner.nextLine());
        System.out.println("Ingrese el teléfono:");
        asegurado.setTelefono(scanner.nextLine());
        System.out.println("Ingrese el email:");
        asegurado.setEmail(scanner.nextLine());
        System.out.println("Ingrese el género:");
        asegurado.setGenero(scanner.nextLine());
        System.out.println("Ingrese el estado civil:");
        asegurado.setEstadoCivil(scanner.nextLine());
        System.out.println("Ingrese la ocupación:");
        asegurado.setOcupacion(scanner.nextLine());
        System.out.println("Ingrese el tipo de seguro:");
        asegurado.setTipoDeSeguro(scanner.nextLine());
        System.out.println("Ingrese la suma asegurada:");
        asegurado.setSumaAsegurada(scanner.nextDouble());
        System.out.println("¿Tiene historial médico? (true/false):");
        asegurado.setTieneHistorialMedico(scanner.nextBoolean());
        scanner.nextLine();  // Limpiar el buffer

        System.out.println("Asegurado creado: " + asegurado);

        // Crear Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese la marca del vehículo:");
        vehiculo.setMarca(scanner.nextLine());
        System.out.println("Ingrese el modelo del vehículo:");
        vehiculo.setModelo(scanner.nextLine());
        System.out.println("Ingrese el año del vehículo (yyyy-mm-dd):");
        vehiculo.setAño(LocalDateTime.parse(scanner.nextLine() + "T00:00"));
        System.out.println("Ingrese el número de placa:");
        vehiculo.setNumeroPlaca(scanner.nextLine());
        System.out.println("Ingrese el color:");
        vehiculo.setColor(scanner.nextLine());
        System.out.println("Ingrese el tipo:");
        vehiculo.setTipo(scanner.nextLine());
        System.out.println("Ingrese el número de identificación vehicular:");
        vehiculo.setNumeroIdentificacionVehicular(scanner.nextLine());
        System.out.println("Ingrese el kilometraje:");
        vehiculo.setKilometraje(scanner.nextDouble());
        System.out.println("¿Está asegurado? (true/false):");
        vehiculo.setAsegurado(scanner.nextBoolean());
        scanner.nextLine();  // Limpiar el buffer
        System.out.println("Ingrese el tipo de combustible:");
        vehiculo.setTipoDeCombustible(scanner.nextLine());
        System.out.println("Ingrese la capacidad de pasajeros:");
        vehiculo.setCapacidadPasajeros(scanner.nextInt());
        scanner.nextLine();  // Limpiar el buffer
        System.out.println("Ingrese el propietario:");
        vehiculo.setPropietario(scanner.nextLine());
        vehiculo.setFechaRegistro(LocalDateTime.now());
        vehiculo.setEstado(true);
        System.out.println("Ingrese el precio:");
        vehiculo.setPrecio(scanner.nextDouble());
        scanner.nextLine();  // Limpiar el buffer

        System.out.println("Vehículo creado: " + vehiculo);

        // Crear Accidente
        Accidente accidente = new Accidente();
        System.out.println("Ingrese la fecha del accidente (yyyy-mm-dd hh:mm):");
        accidente.setFecha(LocalDateTime.parse(scanner.nextLine() + "T00:00"));
        System.out.println("Ingrese la hora del accidente:");
        accidente.setHora(scanner.nextLine());
        System.out.println("Ingrese el lugar del accidente:");
        accidente.setLugar(scanner.nextLine());
        System.out.println("Ingrese la descripción:");
        accidente.setDescripcion(scanner.nextLine());
        System.out.println("Ingrese el tipo de vehículo involucrado:");
        accidente.setTipoVehiculoInvolucrado(scanner.nextLine());
        System.out.println("Ingrese el número de placa del vehículo:");
        accidente.setNumeroPlacaVehiculo(scanner.nextLine());
        System.out.println("Ingrese el nombre del conductor:");
        accidente.setNombreConductor(scanner.nextLine());
        System.out.println("Ingrese el número de identificación del conductor:");
        accidente.setNumeroIdentificacionConductor(scanner.nextLine());
        System.out.println("Ingrese la compañía aseguradora:");
        accidente.setCompaniaAseguradora(scanner.nextLine());
        System.out.println("¿Hay lesionados? (true/false):");
        accidente.setHayLesionados(scanner.nextBoolean());
        scanner.nextLine();  // Limpiar el buffer

        System.out.println("Accidente registrado: " + accidente);

        // Crear Aseguradora
        Aseguradora aseguradora = new Aseguradora();
        System.out.println("Ingrese el nombre de la aseguradora:");
        aseguradora.setNombre(scanner.nextLine());
        System.out.println("Ingrese la razón social:");
        aseguradora.setRazonSocial(scanner.nextLine());
        System.out.println("Ingrese el NIT:");
        aseguradora.setNit(scanner.nextLine());
        System.out.println("Ingrese la dirección:");
        aseguradora.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el teléfono:");
        aseguradora.setTelefono(scanner.nextLine());
        System.out.println("Ingrese el email:");
        aseguradora.setEmail(scanner.nextLine());
        System.out.println("Ingrese la página web:");
        aseguradora.setPaginaWeb(scanner.nextLine());
        System.out.println("Ingrese el país:");
        aseguradora.setPais(scanner.nextLine());
        System.out.println("Ingrese los tipos de seguro:");
        aseguradora.setTiposDeSeguro(scanner.nextLine());
        System.out.println("Ingrese la fecha de fundación (yyyy-mm-dd hh:mm):");
        aseguradora.setFechaFundacion(LocalDateTime.parse(scanner.nextLine() + "T00:00"));

        System.out.println("Aseguradora creada: " + aseguradora);

        // Crear Beneficiario
        Beneficiario beneficiario = new Beneficiario();
        System.out.println("Ingrese el nombre del beneficiario:");
        beneficiario.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido del beneficiario:");
        beneficiario.setApellido(scanner.nextLine());
        System.out.println("Ingrese el número de identificación:");
        beneficiario.setNumeroIdentificacion(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento (yyyy-mm-dd):");
        beneficiario.setFechaNacimiento(LocalDateTime.parse(scanner.nextLine() + "T00:00"));
        System.out.println("Ingrese la relación con el asegurado:");
        beneficiario.setRelacionConAsegurado(scanner.nextLine());
        System.out.println("Ingrese la dirección:");
        beneficiario.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el teléfono:");
        beneficiario.setTelefono(scanner.nextLine());
        System.out.println("Ingrese el email:");
        beneficiario.setEmail(scanner.nextLine());
        System.out.println("Ingrese el porcentaje de beneficio:");
        beneficiario.setPorcentajeBeneficio(scanner.nextDouble());
        System.out.println("¿Está activo? (true/false):");
        beneficiario.setActivo(scanner.nextBoolean());

        System.out.println("Beneficiario creado: " + beneficiario);

        // Cerrar scanner
        scanner.close();

    }
}