package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {
	
	private double honorariosPosHora;
	private String fechaTerminoContrato;
	
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		honorariosPosHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
		fechaTerminoContrato = JOptionPane.showInputDialog("Ingrese fecha de nacimiento (dd/mm/aaaa)");
	
	}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos += "Honorarios por hora: "+ honorariosPosHora + "\n";
		datos += "Fecha termino del contrato: " + fechaTerminoContrato + "\n";
		
		System.out.println(datos);
	}
	
	
	public double getHonorariosPosHora() {
		return honorariosPosHora;
	}
	public void setHonorariosPosHora(double honorariosPosHora) {
		this.honorariosPosHora = honorariosPosHora;
	}
	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}
	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}

	
	
}
