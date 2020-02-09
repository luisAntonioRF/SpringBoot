package com.lui.factura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.lui.factura.entity.ItemFactura;
import com.lui.factura.entity.Producto;

@Configuration
public class AppConfig {

	@Bean("itemFactura")
	public List<ItemFactura>registrarItem(){
		Producto p1 = new Producto("pepsi", 30);
		Producto p2 = new Producto("coca-cola", 40);
		
		ItemFactura linea1 = new ItemFactura(p1, 4);
		ItemFactura linea2 = new ItemFactura(p2, 6);
		
		return Arrays.asList(linea1,linea2);
	}
}
