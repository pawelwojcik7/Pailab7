package pai.lab7.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pai.lab7.entity.Student;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);

    // trzeba dodać update

}
