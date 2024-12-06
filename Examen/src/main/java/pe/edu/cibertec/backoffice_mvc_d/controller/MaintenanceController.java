package pe.edu.cibertec.backoffice_mvc_d.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.backoffice_mvc_d.dto.FilmDetailDto;
import pe.edu.cibertec.backoffice_mvc_d.dto.FilmDto;
import pe.edu.cibertec.backoffice_mvc_d.service.MaintenanceService;

import java.util.List;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    MaintenanceService maintenanceService;

    @GetMapping("/start")
    //metodo inicio
    public String start(Model model) {
        List<FilmDto> films = maintenanceService.getAllFilms();
        model.addAttribute("films", films);
        return "maintenance";

    }

    @GetMapping("/detail/{id}")
// metodo detalles(

    public String detail(@PathVariable Integer id, Model model) {
        FilmDetailDto filmDetailDto = maintenanceService.getFilmById(id);
        model.addAttribute("film", filmDetailDto);
        return "maintenance-detail";
    }

    @GetMapping("/edit/{id}")
//Creamos el editar

    public String edit(@PathVariable Integer id, Model model) {
        FilmDetailDto filmDetailDto = maintenanceService.getFilmById(id);
        model.addAttribute("film", filmDetailDto);
        return "maintenance-edit";
    }

    @PostMapping("/edit-confirm")
    public String edit(@ModelAttribute FilmDetailDto filmDetailDto, Model model) {
        maintenanceService.updateFilm(filmDetailDto);
        return "redirect:/maintenance/start";
    }

    //Metodo eliminar
    @PostMapping("/remove/{id}")
    public String remove(@PathVariable Integer id, Model model) {
        System.out.println("Eliminado " + id);
        return "redirect:/maintenance/start";
    }



}
