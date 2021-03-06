package beans.backoffice;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import com.TodoArte.Classes.CategoriaContenido;
import com.TodoArte.Classes.CategoriaSitio;
import com.TodoArte.FachadeControllers.BackOfficeController;
import com.TodoArte.FachadeInterfaces.BackOfficeInterface;

import beans.Redirector;

@Named
@SessionScoped
public class DefinirCategoria implements Serializable {
	private static final long serialVersionUID = 1L;

	private BackOfficeInterface bo = new BackOfficeController();
	
	private CategoriaContenido catCont = new CategoriaContenido();
	private CategoriaSitio catSit = new CategoriaSitio();
	
	public String definirCategoriaContenido() {
		try {
			
			bo.agregarCategoriaDeContenido(catCont);
			catCont = new CategoriaContenido();
		} catch (Exception e) {
			return Redirector.redirect("500.jsf");
		}
		return Redirector.redirect("backoffice.jsf", "tab=5");
	}
	
	public String definirCategoriaSitio() {
		try {
			bo.agregarCategoriaDeSitio(catSit);
			catSit = new CategoriaSitio();
		} catch (Exception e) {
			return Redirector.redirect("500.jsf");
		}
		return Redirector.redirect("backoffice.jsf", "tab=5");
	}
	
	public CategoriaContenido getCatCont() {
		return catCont;
	}

	public void setCatCont(CategoriaContenido catCont) {
		this.catCont = catCont;
	}

	public CategoriaSitio getCatSit() {
		return catSit;
	}

	public void setCatSit(CategoriaSitio catSit) {
		this.catSit = catSit;
	}
	
}
