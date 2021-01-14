package covidsymulation.demo.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import covidsymulation.demo.Dto.SimulationDto;
import covidsymulation.demo.Service.SimulationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SimulationControllerTestConfiguration.class})
@WebAppConfiguration
public class SimulationControllerTest {


    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Autowired
    private SimulationService simulationService;

    @Before
    public void set() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }


    @Test
    public void should_return_all_simulations() throws Exception {
        when(simulationService.getAllSimulation())
                .thenReturn(buildDummySimulationDto());

        mockMvc.perform(get("/ap1/v1/simulations"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$.[0].name").value("simulation1"))
                .andExpect(jsonPath("$.[0].id").value(23L))
                .andExpect(jsonPath("$.[1].name").value("simulation2"))
                .andExpect(jsonPath("$.[1].id").value(24L));

    }

    @Test
    public void should_return_created_status_code_when_adding_simulation() throws Exception {
        mockMvc.perform(post("/ap1/v1/simulations").contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(convertAccountTypeToJson(
                new SimulationDto(
                        25L,
                        "simulation3",
                        500000,
                        300,
                        1.6,
                        0.05,
                        15,
                        200,
                        new ArrayList<>()))))
                .andExpect(status().isCreated());
    }

    private String convertAccountTypeToJson(SimulationDto simulationDto) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(simulationDto);
    }

    private List<SimulationDto> buildDummySimulationDto() {

         return asList(new SimulationDto(
                        23L,
                        "simulation1",
                        300000,
                        100,
                        1.4,
                        0.03,
                        10,
                        300,
                        new ArrayList<>()),
                new SimulationDto(
                        24L,
                        "simulation2",
                        400000,
                        200,
                        1.5,
                        0.04,
                        12,
                        400,
                        new ArrayList<>()));

    }
}
