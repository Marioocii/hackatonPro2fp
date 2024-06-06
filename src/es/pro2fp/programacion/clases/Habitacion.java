package es.pro2fp.programacion.clases;

import java.time.LocalDateTime;

public class Habitacion {

    private int id_habitacion;
    private int numeroHabitacion;
    private String tipoHabitacion;
    private boolean disponible;
    private boolean borrada;
    private LocalDateTime fecha_inicio_vigencia;
    private LocalDateTime fecha_borrado;
    private float precio_habitacion_euros;
    private int hoteles_idHotel;

    public Habitacion(int id_habitacion, int numeroHabitacion, String tipoHabitacion,
                      boolean disponible, boolean borrada, LocalDateTime fecha_inicio_vigencia,
                      LocalDateTime fecha_borrado, float precio_habitacion_euros, int hoteles_idHotel){
        this.id_habitacion = id_habitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.disponible = disponible;
        this.borrada = borrada;
        this.fecha_borrado = fecha_borrado;
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
        this.precio_habitacion_euros = precio_habitacion_euros;
    }

    /**
     *
     * @return getId_habitacion
     */
    public int getId_habitacion() {
        return id_habitacion;
    }

    /**
     *
     * @param id_habitacion
     */
    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    /**
     *
     * @return getNumeroHabitacion
     */
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    /**
     *
     * @param numeroHabitacion
     */
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    /**
     *
     * @return getTipoHabitacion
     */
    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    /**
     *
     * @param tipoHabitacion
     */
    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    /**
     *
     * @return isDisponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     *
     * @param disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     *
     * @return isBorrada
     */
    public boolean isBorrada() {
        return borrada;
    }

    /**
     *
     * @param borrada
     */
    public void setBorrada(boolean borrada) {
        this.borrada = borrada;
    }

    /**
     *
     * @return getFecha_inicio_vigencia
     */
    public LocalDateTime getFecha_inicio_vigencia() {
        return fecha_inicio_vigencia;
    }

    /**
     *
     * @param fecha_inicio_vigencia
     */
    public void setFecha_inicio_vigencia(LocalDateTime fecha_inicio_vigencia) {
        this.fecha_inicio_vigencia = fecha_inicio_vigencia;
    }

    /**
     *
     * @return getFecha_borrado
     */
    public LocalDateTime getFecha_borrado() {
        return fecha_borrado;
    }

    /**
     *
     * @param fecha_borrado
     */
    public void setFecha_borrado(LocalDateTime fecha_borrado) {
        this.fecha_borrado = fecha_borrado;
    }

    /**
     *
     * @return getPrecio_habitacion_euros
     */
    public float getPrecio_habitacion_euros() {
        return precio_habitacion_euros;
    }

    /**
     *
     * @param precio_habitacion_euros
     */
    public void setPrecio_habitacion_euros(float precio_habitacion_euros) {
        this.precio_habitacion_euros = precio_habitacion_euros;
    }

    /**
     *
     * @return getHoteles_idHotel
     */
    public int getHoteles_idHotel() {
        return hoteles_idHotel;
    }

    /**
     *
     * @param hoteles_idHotel
     */
    public void setHoteles_idHotel(int hoteles_idHotel) {
        this.hoteles_idHotel = hoteles_idHotel;
    }

    /**
     *
     * @return toString de la clase Habitacion
     */
    @Override
    public String toString (){
        String tmp = "\n---------------------" +
                "\nNumero de la Habitación: " + this.getNumeroHabitacion() +
                "\nTipo de Habitación: " + this.getTipoHabitacion();
        if (isDisponible()) {
            tmp = tmp + "\nDisponible: Sí";
        } else {
            tmp = tmp + "\nDisponible: No";
        }
        if (isBorrada()) {
            tmp = tmp + "\nBorrada: Sí" + "\nFecha de Inicio de Vigencia: " + this.getFecha_inicio_vigencia() + "Precio: " + this.getPrecio_habitacion_euros();
        } else {
            tmp = tmp + "\nBorrada: No" + "\nFecha de Inicio de Vigencia: " + this.getFecha_inicio_vigencia();
        }
        return tmp;
    }
}
