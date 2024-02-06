package Ejercicio41_furbo;

public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private Resultado resultado;
	
	public Partido() {
		
	}

	public Equipo getEquipolocal() {
		return equipoLocal;
	}

	public void setEquipolocal(Equipo equipolocal) {
		this.equipoLocal = equipolocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return equipoLocal.getNombreEquipo() + " Vs " + equipoVisitante.getNombreEquipo() + " " + resultado.toString(); 
	}
	
	public Equipo getEquipoGanador() {
		if (resultado.isVictoriaLocal()) {
			return equipoLocal;
		}
		if (resultado.isVictoriaVisitante()) {
			return equipoVisitante;
		}
		
		return null;
	}
	
	

}
