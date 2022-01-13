import './App.css';
import  ItemService  from './services/TaskService';
import React, { Component } from "react";
import {Home} from "./components/home";
import {Login} from "./components/login";
import {Taskview} from "./components/taskview";
import { BrowserRouter as Router,Routes,Route } from "react-router-dom";

export default class App extends Component{
  constructor(props){
    super(props);
    this.state = {tasks:[]};
    this.ItemSevice = new ItemService();
  }

  componentDidMount(){
    this.ItemSevice.getAll().then(data => this.setState({tasks : data}))
  }

  render(){
    return(
    <Router>
      <Routes>

        <Route exact path="/" element={<Home/>}/>
        <Route exact path="/login" element={<Login/>}/>
        <Route exact path="/taskview" element={<Taskview tasks={this.state.tasks}/>}/>

      </Routes>
    </Router>
    )
  }
}