package de.fesere.hypermedia.cj.annotation.persons;


import de.fesere.hypermedia.cj.annotations.Data;
import de.fesere.hypermedia.cj.annotations.ItemConfig;
import de.fesere.hypermedia.cj.annotations.NullWriteStrategy;

@ItemConfig(writeNull = NullWriteStrategy.AS_NULL)
public class NullPerson extends BasePerson {

    public NullPerson(@Data(name = "name") String name,
                      @Data(name = "age")  int age,
                      @Data(name = "id")   int id,
                      @Data(name = "isAdmin") boolean isAdmin,
                      @Data(name = "someValue") double someValue) {
        super(name, age, id, isAdmin, someValue);
    }
}
