
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class MessageResource {

	@GetMapping("/simpleMessageWelcome")
	public String simpleMessageWelcome() {
		return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
	}
	
	@GetMapping(value = "/login")
	public String login(String user, String password) {
		String message = null;
		String usuario = "Paula";
		String senha = "123";
				
		if(usuario.isEmpty() || senha.isEmpty()) {
			message = "USUÁRIO E SENHA NÃO INFORMADOS";
		}
		else if (usuario.length() > 15 || senha.length() >15) {
			message = "USUÁRIO E SENHA INVÁLIDOS";
		}else {
			message = "LOGIN EFETUADO COM SUCESSO";
		}
		
		return message;
		
	}
}
