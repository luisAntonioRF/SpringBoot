package com.lui.factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lui.factura.entity.ItemFactura;
import com.lui.factura.entity.Producto;

@Configuration
public class AppConfig {

	//Bean numero 1
	@Bean("itemFactura")
	public List<ItemFactura>registrarItem(){
		Producto p1 = new Producto("pepsi", 30);
		Producto p2 = new Producto("coca-cola", 40);
		
		ItemFactura linea1 = new ItemFactura(p1, 4);
		ItemFactura linea2 = new ItemFactura(p2, 6);
		
		return Arrays.asList(linea1,linea2);
	}
	
	//Bean numero 2
		@Bean("itemOficina")
		public List<ItemFactura>registrarItemOficina(){
			Producto p1 = new Producto("silla", 300);
			Producto p2 = new Producto("impresora", 5000);
			
			ItemFactura linea1 = new ItemFactura(p1, 14);
			ItemFactura linea2 = new ItemFactura(p2, 16);
			
			return Arrays.asList(linea1,linea2);
		}
}
