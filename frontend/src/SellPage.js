import * as React from 'react';
import Box from '@mui/material/Box';
import InputAdornment from '@mui/material/InputAdornment';
import TextField from '@mui/material/TextField';
import { Container, Paper, Button } from '@mui/material';

export default function InputAdornments() {
  const [values, setValues] = React.useState({
    amount: '',
    password: '',
    weight: '',
    weightRange: '',
  });


  const handleClick=(e)=>{};
  return (
      <p>
          <p>
      <Container>
       <h3>SELL YOUR VEHICLE</h3>
       <Paper> 
    <Box sx={{ display: 'flex', flexWrap: 'wrap' }}>
      <div>
        <TextField id="outlined-basic" label="Vehicle Identification Number" variant="outlined" fullWidth 
       // value={VIN}
       // onChange={(e)=>setName(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Price" variant="outlined" fullWidth
       // value={price}
        //onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Make " variant="outlined" fullWidth
        //value={make}
       // onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Model " variant="outlined" fullWidth
       // value={model}
       // onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Body " variant="outlined" fullWidth
       // value={body}
       // onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Color " variant="outlined" fullWidth
       // value={color}
       // onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Vehicle Type " variant="outlined" fullWidth
        //value={vehicleType}
        //onChange={(e)=>setAddress(e.target.value)}
        />
        &nbsp;
        <TextField id="outlined-basic" label="Tow Capacity " variant="outlined" fullWidth
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
        />
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
