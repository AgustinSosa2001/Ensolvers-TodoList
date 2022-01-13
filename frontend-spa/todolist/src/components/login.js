import React from "react";

export const Login = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid text-center">
          <span className="navbar-brand mb-0 h1">SPA</span>
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
              <li className="nav-item ">
                <a className="nav-link hover" aria-current="page" href="/">
                  Home
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <div className="container mt-5">
        <div className="row justify-content-center">
          <div className="text-center col-lg-6">
            <form action="">
              <label
                htmlFor="username"
                className="m-2 label-control fw-bold fs-4 text-white"
              >
                Username
              </label>
              <input type="text" className="form-control" />

              <label
                htmlFor="password"
                className="m-2 label-control fw-bold fs-4 text-white"
              >
                Password
              </label>
              <input type="password" className="form-control" />
            </form>
            <a href="/taskview">
              <button className="mt-3 btn-lg btn-light btn bg-gradient rounded-pill">
                Log in
              </button>
            </a>
          </div>
        </div>
      </div>
    </div>
  );
};
