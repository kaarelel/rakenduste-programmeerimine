import { React } from "react"

const Colors = (props) => {

  let textColorStyle = {
    color: props.textColor
    
  };

  return (
    <>
      <h1 style={textColorStyle}>Värv</h1>
    </>
  );
  
}

export default Colors