package com.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "admin")
@NoArgsConstructor
@Data
public class Admin {
    @Id
   private String _id;
    private String name;
    private String phone;

    public String calculateCustomerId()
    {
        return name+_id;
    }


    public String get_id() {
        return _id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
