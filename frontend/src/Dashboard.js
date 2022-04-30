/** @format */
import classes from "./Dashboard.module.css";
import { Link } from "react-router-dom";

const Dashboard = () => {
  return (
    <main className={classes.main}>
      <div className={classes.mainText}>
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