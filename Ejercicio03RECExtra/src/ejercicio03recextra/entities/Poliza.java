/*
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos. 
 */
package ejercicio03recextra.entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author guzma
 */
public class Poliza {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int numeroDePoliza;
    private LocalDate fechaDeInicio;
    private LocalDate fechaDeFin;
    private ArrayList<Cuota> listaCuotas = new ArrayList();
    private String formaDePago;
    private int montoAsegurado;
    private boolean incluyeGranizo;
    private int montoMaximoGranizo;
    private String tipoDeCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo vehiculo, int numeroDePoliza, LocalDate fechaDeInicio, LocalDate fechaDeFin, String formaDePago, int montoAsegurado, boolean incluyeGranizo, int montoMaximoGranizo, String tipoDeCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroDePoliza = numeroDePoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(int numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public ArrayList<Cuota> getListaCuotas() {
        return listaCuotas;
    }

    public void setListaCuotas(ArrayList<Cuota> listaCuotas) {
        this.listaCuotas = listaCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }
    
    
    
}
