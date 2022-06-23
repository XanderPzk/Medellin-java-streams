package com.medjava.lambda.model;

import java.util.List;

public class AlumnoRepositorio {
    private List<Alumno> alumnoList;

    public AlumnoRepositorio(List<Alumno> listaAlumnos) {
      this.alumnoList = listaAlumnos;
    }

    public Alumno findById(String cedula) {
      for (Alumno emp : alumnoList) {
        if (emp.getCedula().equals(cedula)) {
          return emp;
        }
      }
      return null;
    }
}
