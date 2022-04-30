/** @format */
import classes from "./Dashboard.module.css";
import { Link } from "react-router-dom";

const Dashboard = () => {
  return (
    <main className={classes.main}>
      <div className={classes.mainText}>
        <img src="https://static.ffx.io/images/$width_800%2C$height_450/t_crop_auto/q_86%2Cf_auto/f2427bcc7d6abf12255364266536624f868db95c" alt=""></img>
        <Link to="/BuyPage">
          <h2>Buy</h2>
        </Link>
        <Link to="/SellPage">
          <h2>Sell</h2>
        </Link>
        {}
      </div>
    </main>
  );
};

export default Dashboard;