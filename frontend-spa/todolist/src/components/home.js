import React from "react";

export const Home = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid text-center">
          <span className="navbar-brand mb-0 h1 ">SPA</span>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNav"
            aria-controls="navbarNav"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarNav">
            <ul className="navbar-nav ms-auto ">
              <li className="nav-item">
                <a className="nav-link" aria-current="page" href="/">
                  Home
                </a>
              </li>
              <li className="nav-item ">
                <a className="nav-link" href="/login">
                  Login
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <h1 className="text-center m-5 text-white">Task organizer.</h1>

      <h3 className="text-center text-white">Please login to start.</h3>

      <div className="mt-5 text-center">
        <a href="/login">
          <button
            id="btnClick"
            className=" btn btn-lg btn-light bg-gradient rounded-pill"
          >
            Login
          </button>
        </a>
      </div>
    </div>
  );
};
