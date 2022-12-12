package pai.lab7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pai.lab7.entity.Student;
import pai.lab7.exception.StudentNotFoundException;
import pai.lab7.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public void addStudent(Student student) {

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) throws StudentNotFoundException{

        Optional<Student> probablyStudent = studentRepository.findStudentById(id);

        if(probablyStudent.isEmpty())
        {
            throw new StudentNotFoundException(id);
        }
        else{
            studentRepository.delete(probablyStudent.get());
        }
    }

    public void updateStudent(Long id, Student student) throws StudentNotFoundException{

        Optional<Student> probablyStudent = studentRepository.findStudentById(id);

        if(probablyStudent.isEmpty())
        {
            throw new StudentNotFoundException(id);
        }
        else{
            // update student
        }

    }

}