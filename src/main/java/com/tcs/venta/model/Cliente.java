package com.tcs.venta.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente{
    private Long id;
    private String dni;
    private Date fechaNacimiento;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String direccion;
    
    


}