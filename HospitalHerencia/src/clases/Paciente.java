package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona{
	
	
	private int numeroHistorialClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	
	
	@Override
	public void registrarDatos() {
		
		//Llamamos al metodo registrar datos desde la "superClase" para llenar los datos junto con los
		//heredados
		
		super.registrarDatos();
		
		
		listaMedicamentosAlergico = new ArrayList<>();
		numeroHistorialClinica = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la historia clinica"));
		sexo = JOptionPane.showInputDialog("Ingrese el sexo");
		grupoSanguineo = JOptionPane.showInputDialog("Ingrese el grupo sanguineo");
		
		String pregunta = JOptionPane.showInputDialog("¿Es alergico a algun medicamento? si o no");
		
		if (pregunta.equalsIgnoreCase("si")) {
			String medicamento = "";
			String continuar = "";
			
			do {
				medicamento = JOptionPane.showInputDialog("Ingrese el nombre del ,edicamento al que es alergico");
				listaMedicamentosAlergico.add(medicamento);
				
				continuar = JOptionPane.showInputDialog("Ingrese (si), si desea continuar");
			}while (continuar.equalsIgnoreCase("si"));
		}
	}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos="Numero Historia Clinica: "+ numeroHistorialClinica+ "\n";
		datos= "Sexo: "+sexo+"\n";
		datos="Grupo Sanguineo: "+grupoSanguineo+"\n";
		
		if (listaMedicamentosAlergico.size()>0) {
			datos +="Lista de Medicamentos a los que es alergico\n";
			for (int i = 0; i < listaMedicamentosAlergico.size(); i++) {
				datos+="\t"+listaMedicamentosAlergico.get(i)+"\n";
				
			}
		}else {
			datos+="El paciente, no es alergico a ningun medicamento";
		}
		
		System.out.println(datos);
	}
	
	
	public int getNumeroHistorialClinica() {
		return numeroHistorialClinica;
	}
	
	public void setNumeroHistorialClinica(int numeroHistorialClinica) {
		
        try {
            // Validar que el número de historia clínica sea un entero positivo
            if (numeroHistorialClinica <= 0) {
                throw new IllegalArgumentException("El número de historia clínica debe ser un entero positivo.");
                //Cuando se lanza una excepción usando throw new, el flujo de ejecución se detiene en ese punto y 
                //pasa al bloque catch correspondiente, donde se puede manejar la excepción.
            }
            
            // Asignar el número de historia clínica si la validación es exitosa
            this.numeroHistorialClinica = numeroHistorialClinica;
        } catch (IllegalArgumentException e) {
            // Manejo de la excepción
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentosAlergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentosAlergico(ArrayList<String> listaMedicamentosAlergico) {
		this.listaMedicamentosAlergico = listaMedicamentosAlergico;
	}
	

}
