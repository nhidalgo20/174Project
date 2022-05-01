import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import FormControl from '@mui/material/FormControl';
import InputLabel from '@mui/material/InputLabel';
import { Container, Paper, Button, Select, MenuItem } from '@mui/material';

export default function InputAdornments() {
  const vType = ["Car", "Truck", "Motorcycle", "RV"];
  const [value, setValue] = React.useState("");
  const [VIN, setVIN] = React.useState("");
  const [color, setColor] = React.useState("");
  const [price, setPrice] = React.useState("");
  const [make, setMake] = React.useState("");
  const [model, setModel] = React.useState("");
  const [body, setBody] = React.useState("");
  const [vehicleType, setVehicleType] = React.useState("");
  const handleChange = e => setValue(e.target.value)


  const handleClick=(e)=>{
    e.preventDefault()
  //   const student={name,address}
  //   console.log(student)
  //   fetch("http://localhost:8080/student/add",{
  //     method:"POST",
  //     headers:{"Content-Type":"application/json"},
  //     body:JSON.stringify(student)

  // })
  .then(()=>{
    console.log("Vehicle is now up for Sale!!!")
  })
}


  return (
      <p>
          <p>
      <Container>
       <h3>SELL YOUR VEHICLE</h3>
       <Paper> 
    <Box sx={{ display: 'flex', flexWrap: 'wrap' }}>
      <div>
        <TextField id="outlined-basic" label="Vehicle Identification Number" variant="outlined" fullWidth 
        value={VIN}
        onChange={(e)=>setVIN(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Price" variant="outlined" fullWidth
        value={price}
        onChange={(e)=>setPrice(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Make " variant="outlined" fullWidth
        value={make}
        onChange={(e)=>setMake(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Model " variant="outlined" fullWidth
        value={model}
        onChange={(e)=>setModel(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Body " variant="outlined" fullWidth
        value={body}
        onChange={(e)=>setBody(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Color " variant="outlined" fullWidth
        value={color}
        onChange={(e)=>setColor(e.target.value)}
        />
        &nbsp;
        {/* <FormControl fullWidth >
        <InputLabel id="demo-simple-select-autowidth-label">Vehicle Type</InputLabel>
        <Select
          // labelId="demo-simple-select-autowidth-label"
          // id="demo-simple-select-autowidth"
          // value={age}
          onChange={handleChange}
          // autoWidth
          // label="Age"
        >
          <MenuItem value="" >
            <em>None</em>
          </MenuItem>
          <MenuItem value={vehicleType}>Car</MenuItem>
          <MenuItem value={'Truck'}>Truck</MenuItem>
          <MenuItem value={'Motorcycle'}>Motor Cycles</MenuItem>
          <MenuItem value={'RV'}>RV</MenuItem>
        </Select>
      </FormControl> */}
      &nbsp;
      &nbsp;
        <select value ={vehicleType} onChange={e=>setVehicleType(e.target.value)}>
          <option>Car</option>
          <option>Truck</option>
          <option>Motorcycle</option>
          <option>RV</option>
        </select>
        &nbsp;
      {vehicleType === vType[1] && <TextField id="outlined-basic" label="Tow Capacity" variant="outlined" fullWidth/> }
      {vehicleType === vType[2] && <TextField id="outlined-basic" label="Motorcylce Type" variant="outlined" fullWidth/> }
      {vehicleType === vType[3] && <TextField id="outlined-basic" label="Water Capacity" variant="outlined" fullWidth/> }
        {
          //<TextField id="outlined-basic" label="Tow Capacity " variant="outlined" fullWidth
          // value={towCapacity}
           //onChange={(e)=>setAddress(e.target.value)}
           ///>
        }
        {/* <TextField id="outlined-basic" label="Tow Capacity " variant="outlined" fullWidth
       // value={towCapacity}
        //onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Motorcylce Type " variant="outlined" fullWidth
       // value={motorCycleType}
       // onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Water Capacity " variant="outlined" fullWidth
       // value={waterCapacity}
        //onChange={(e)=>setAddress(e.target.value)}
        /> */}
        &nbsp;
        &nbsp;
        <div>
        <Button variant="contained" color="secondary" onClick={handleClick}> Submit </Button>
        &nbsp;
        &nbsp;
        </div>
      </div>
    </Box>
    </Paper>
    </Container>
    </p>
    </p>
  );
}
