package se.lexicon.firstspringbootproject.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import se.lexicon.firstspringbootproject.model.Student;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentDaoJPAImplTest {


    @Autowired
    StudentDao studentDao;

    @BeforeEach
   void setUp() {
    }

    @Test
    void testPersist() {

        studentDao.persist(new Student("Test" ,"Testsson","twst@test.com"));




    }
}