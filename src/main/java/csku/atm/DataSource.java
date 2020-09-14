package csku.atm;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
