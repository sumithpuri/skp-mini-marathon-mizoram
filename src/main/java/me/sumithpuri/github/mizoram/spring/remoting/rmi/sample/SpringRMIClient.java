package me.sumithpuri.github.mizoram.spring.remoting.rmi.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.sumithpuri.github.mizoram.spring.remoting.service.Country;
import me.sumithpuri.github.mizoram.spring.remoting.service.CountryService;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Code Sample			Brainbench Spring 2.5 Certification [+ Spring In Action Samples]
 * Sample Topic			Core Spring (Remoting)
 * Certificate URL		https://goo.gl/X321kd
 * Package Prefix 		me.sumithpuri.github.mizoram
 * Project Codename		mizoram
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class SpringRMIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-rmi-client.xml");
		CountryService countryService = (CountryService) context.getBean("countryService");
		System.out.println("Invoking Spring Remote RMI Service....");
		Country[] countries = countryService.getAllCountries();
		
		System.out.println();
		for(Country country: countries) {
			System.out.println(country.getCountryId() + " : " + country.getCountryName());
		}
	}
}
