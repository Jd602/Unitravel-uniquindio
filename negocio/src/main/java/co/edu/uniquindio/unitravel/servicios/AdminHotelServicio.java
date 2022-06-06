package co.edu.uniquindio.unitravel.servicios;

import co.edu.uniquindio.unitravel.entidades.AdminHotel;
import co.edu.uniquindio.unitravel.entidades.Ciudad;
import co.edu.uniquindio.unitravel.entidades.Hotel;

import java.util.List;

public interface AdminHotelServicio {

    AdminHotel registrarAdminHotel(AdminHotel a) throws Exception;

    AdminHotel actualizarAdminHotel(AdminHotel a) throws Exception;

    AdminHotel obtenerAdminHotel(String cedula);

    void eliminarAdminHotel(String cedula) throws Exception;

    List<AdminHotel> listarAdminsHotel();

    AdminHotel validarLoginAdminHotel(String correo, String contraseña) throws Exception;

    //Gestionar Hoteles

    Hotel registrarHotel(Hotel h) throws Exception;

    Hotel actualizarHotel(Hotel h) throws Exception;

    Hotel obtenerHotel(int codigo);

    void eliminarHotel(int codigo) throws Exception;

    List<Hotel> listarHoteles();

    Ciudad obtenerCiudad(Integer codigo) throws Exception;
}
