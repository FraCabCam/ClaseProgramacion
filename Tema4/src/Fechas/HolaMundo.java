package Fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoEra;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class HolaMundo {
	public static void main(String[] args) {
		LocalDate fechaHoy = LocalDate.now();
		System.out.println(fechaHoy);
		
		LocalDate fechaOtra = LocalDate.of(2021, 10, 3);
		System.out.println(fechaOtra);
		
		//fechaOtra = fechaOtra.withYear(2023);
		
		//System.out.println(fechaOtra);
		
		//Integer dia = fechaHoy.getDayOfMonth();
		
		//System.out.println(dia);
		
		//System.out.println(fechaHoy.isLeapYear());
		//System.out.println(fechaOtra.isLeapYear());
		//System.out.println(fechaHoy.lengthOfMonth());
		
		
		//LocalDate fechaHoyMas1Semana = fechaHoy.plusWeeks(1);
		
		//System.out.println(fechaHoyMas1Semana);
		
		//Integer diaSemana = fechaHoy.getDayOfWeek().getValue();
		//System.out.println(diaSemana);
		
		
		//Period periodo = fechaOtra.until(fechaHoy);//primero la fecha antigua y devuelve un periodo (x años, x meses y x días de la primera fecha a la segunda)
		//System.out.println(periodo.getYears()*12 + periodo.getMonths());
		//System.out.println(periodo.getMonths());
		//System.out.println(periodo.getDays());
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String cadena = fechaHoy.format(formato); //devuelve una cadena (el format)
		
		System.out.println(cadena);
		
		String fechaCadena = "13/04/2022";
		LocalDate fechaString = LocalDate.parse(fechaCadena,formato); //es importante que el formato coincida o peta
		System.out.println(fechaString);
		
		
	}
}
