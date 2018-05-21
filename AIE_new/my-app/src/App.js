import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor() {
    super();
    this.state = {
      data: [],
      searchParams: "",
      currentMenuTab: 1,
    };
  }
  componentWillMount() {
    
    fetch('http://localhost:8095/showBalance?mobileNumber=25999999').then(results => results.json())
    .then(res => this.setState({ data: res }));
   
  }

  handleSearch = (e) => {
    
    e.preventDefault();
    this.setState({ searchParams : e.target[0].value });
    this.componentWillMount();
  }

  handleMenu(e)
  {
    e.preventDefault();
    var lis = document.getElementById("cssmenu").getElementsByTagName("li");
    this.setState({  currentMenuTab : e.currentTarget.dataset.id });
   
    for (var i = 0; i < lis.length; i++) {
      if(i === e.currentTarget.dataset.id-1)
        lis[i].className = "active";
      else
        lis[i].className = "";
    }
  }

  render() {
    return (
      <div className="App">

        <header>
      
          <div id='cssmenu'>
           
            <ul>
              <img src={logo} alt="logo"/>
              <li className='active' data-id="1" onClick = {this.handleMenu.bind(this)}><a>Products</a></li>
              <li data-id="2" onClick = {this.handleMenu.bind(this)}><a>Partner</a></li>
              <li data-id="3" onClick = {this.handleMenu.bind(this)}><a>Industry</a></li>

                <div className="search-container">
                <form onSubmit={this.handleSearch}>
                  <input type="text" placeholder="Search.." name="search"/>
                  <button type="submit">Submit</button>
                </form>
                </div>
            </ul>
          </div>
        </header>

        <p className="App-intro">
          {JSON.stringify(this.state.data)}
        </p> 
   
      </div>

     
    );
  }
}

export default App;
