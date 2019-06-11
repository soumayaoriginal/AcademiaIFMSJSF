/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import br.com.academiaif.mapeamento.outros.PlanoMapeamento;
import br.com.academiaif.repository.PlanoRepository;
import java.lang.annotation.Annotation;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author 70071923195
 */
@FacesConverter(forClass = PlanoMapeamento.class)
public class PlanoConverter implements Converter{     

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        //return PlanoRepository.buscarPorId(value);
        PlanoRepository repo = new PlanoRepository();
        return (Object) repo.buscarPorId(new Long(string));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (o == null) {
            return null;
          }
        PlanoMapeamento retorno = (PlanoMapeamento) o;
        System.out.println("teste string");
        return String.valueOf(retorno.getIdPlano());
    }
}
