package teste;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class validaEmail {
	
	
	
	public Boolean validaEmail(String email) throws NoSuchMethodException,
	FileNotFoundException, ScriptException {

	ScriptEngineManager factory = new ScriptEngineManager();
	ScriptEngine engine = factory.getEngineByName("JavaScript");
	Invocable invocable = (Invocable) engine;

	engine.eval(new FileReader("src/main/resources/script.js"));
	Boolean resultado = (Boolean) invocable.invokeFunction("valida_email", email);
	
	return resultado;
	}
}
