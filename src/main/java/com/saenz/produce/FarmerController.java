package com.saenz.produce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/farmers")
public class FarmerController {
    private FarmerRepository farmerRepository;

    public FarmerController(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    @GetMapping("/all")
    public List<Farmer> getAll() {
        List<Farmer> farmers = this.farmerRepository.findAll();

        return farmers;
    }

}
