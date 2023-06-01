package com.example.backend.catering.controlador;

import com.example.backend.catering.dto.UsuarioDTO;
import com.example.backend.catering.entidades.Usuario;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistroControlador {
    private final JavaMailSender mailSender;

    @Autowired
    public RegistroControlador(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @PostMapping("/registro")
    public String registroUsuario(@RequestBody Usuario usuario) {
        try {
            MimeMessage mensaje= mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mensaje, true);

            helper.setFrom("proyectofusioncatering@gmail.com");
            helper.setTo(usuario.getEmail());
            helper. setSubject("REGISTRO EXITOSO");
            helper.setText("<h1> Bienvenido a Fusion Catering</h1>"+
                    "<p>Tu registro ha sido exitoso. Aquí tienes tus detalles de inicio de sesión:</p>" +
                    "<p>Usuario: " + usuario.getNombre() + "</p>" +
                    "<p>Correo electrónico: " + usuario.getEmail() + "</p>" +
                    "<a href='https://google.com'>Iniciar sesión</a>", true);

            mailSender.send(mensaje);

            return "correo de confirmacion enviado";

        }catch (Exception e){
            e.printStackTrace();
            return "ocurrio un error al enviar el correo";
        }
    }
}
