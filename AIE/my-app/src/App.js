import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor() {
    super();
    this.state = {
      data: [],
    };
  }
  componentWillMount() {
    
    fetch('http://localhost:8095/showBalance?mobileNumber=25999999').then(results => results.json())
    .then(res => this.setState({ data: res }));
   
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          {JSON.stringify(this.state.data)}
        </p>
      </div>
    );
  }
}

export default App;
