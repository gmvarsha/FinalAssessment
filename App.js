import {useState} from 'react';
const App = () => {
  const [number, setNumber] = useState(0);
  function randomNumberInRange(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }
  const handleClick = () => {
    setNumber(randomNumberInRange(100, 500));
  };
  return (

  <div>

  <h2 >Random Number is: {number}</h2>

  <button onClick={handleClick}>Generate random number</button>

  </div>
  );
};
export default App;