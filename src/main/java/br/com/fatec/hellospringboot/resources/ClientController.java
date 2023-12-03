package br.com.fatec.hellospringboot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.hellospringboot.entities.Client;

@RestController
public class ClientController {

    @GetMapping("client") // endpoint 1
    public Client getClient() {
        Client c = new Client();
        c.setId(1);
        c.setName("Nicolas");
        c.setBalance(1150);
        return c;
        // c guarda o objeto
    }

    @GetMapping("clients") // endpoint 1
    public List<Client> getClients() {
        ArrayList<Client> clients = new ArrayList<Client>();
        Client c1 = new Client();
        c1.setId(1);
        c1.setName("Nicolas");
        c1.setBalance(1150);

        Client c2 = new Client();
        c2.setId(2);
        c2.setName("Glauco");
        c2.setBalance(10000);

        Client c3 = new Client();
        c3.setId(3);
        c3.setName("Erico");
        c3.setBalance(2000);

        clients.add(c1);
        clients.add(c2);
        clients.add(c3);

        return clients;

    }

}
