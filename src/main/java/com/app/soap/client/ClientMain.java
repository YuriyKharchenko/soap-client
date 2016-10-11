package com.app.soap.client;

import com.app.soap.Person;
import com.app.soap.ProcessorImpl;
import com.app.soap.ProcessorImplService;

public class ClientMain {
    public static void main(String[] args) {
        ProcessorImplService service = new ProcessorImplService();
        ProcessorImpl processor = service.getProcessorImplPort();

        for (int i = 0; i < 10; i++) {
            Person p = new Person();
            p.setName("John" + i);
            p.setAge(i);
            processor.save(p);

        }

    }
}
