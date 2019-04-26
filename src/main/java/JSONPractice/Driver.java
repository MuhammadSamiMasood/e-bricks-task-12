package JSONPractice;

import com.fasterxml.jackson.databind.*;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String args[]) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = objectMapper.readValue(new File("C:\\Users\\Mesmer\\IdeaProjects\\Task1_(Shape)\\src\\main\\java\\JSONPractice\\JSONData"), Person.class);

        System.out.println(""+person.getPersonId());
        System.out.println(person.getName());
        System.out.println(person.getPersonCNIC());
        System.out.println(person.getR());
        System.out.println(person.getG());

        System.out.println("\n");

        PersonImmutable personImmutable = objectMapper.readValue(new File("C:\\Users\\Mesmer\\IdeaProjects\\Task1_(Shape)\\src\\main\\java\\JSONPractice\\JSONData"), PersonImmutable.class);
        System.out.println(personImmutable.getId());
        System.out.println(personImmutable.getName());

        System.out.println("\n");

        InjectableValues.Std injectableValues = new InjectableValues.Std();

        injectableValues.addValue(String.class, "driver file");
        injectableValues.addValue("score", 300);
        injectableValues.addValue(int.class, 10);
        objectMapper.setInjectableValues(injectableValues);


        PersonInject personInject = objectMapper.readValue(new File("C:\\Users\\Mesmer\\IdeaProjects\\Task1_(Shape)\\src\\main\\java\\JSONPractice\\JSONData"), PersonInject.class);

        System.out.println(personInject.getSource());
        System.out.println(personInject.getId());
        System.out.println(personInject.getName());
        System.out.println(personInject.getRuns());
        System.out.println(personInject.getwork());

        System.out.println("\n");

        PersonDeserializer personDeserializer = objectMapper.readValue(new File("C:\\Users\\Mesmer\\IdeaProjects\\Task1_(Shape)\\src\\main\\java\\JSONPractice\\JSONData"), PersonDeserializer.class);
        System.out.println(personDeserializer.id);
        System.out.println(personDeserializer.name);
        System.out.println(personDeserializer.test);
    }

}
