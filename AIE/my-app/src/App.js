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
   
	var data2 = new FormData();
	const payload = {
		technologyTag : 'tag1'

	};
data2.append("technologyTag", JSON.stringify(payload));
   
    fetch('http://localhost:8090/search/getPartnersFromTag',{
	method: 'POST',
    body: data2}).then(results => results.json())
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
