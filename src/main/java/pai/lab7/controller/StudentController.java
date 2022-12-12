package pai.lab7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;
import pai.lab7.entity.Student;
import pai.lab7.exception.StudentNotFoundException;
import pai.lab7.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.ok().body(studentService.getAll());
    }

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        try {
            studentService.deleteStudent(id);
        } catch (StudentNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Student został usunięty");
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable Long id, @RequestBody Student student){

        //trzeba uzupełnic serwis i repo o update
        return null;
    }
}

