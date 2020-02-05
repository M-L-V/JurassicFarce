import React from 'react';
import SVG from 'react-inlinesvg';

const Paddock = ({ paddock, handleSelectedPaddock }) => {
  if (!paddock) {
    return "Loading";
  }

  function handleSelect(event) {
    handleSelectedPaddock(paddock);
  }

  return (

    <div className="paddockItem">
      <div className="paddockImageContainer" onClick={handleSelect}>
        <SVG src={paddock.pimage} className="paddockImg" />
        <div className="paddockData">
          <div className="row01Data">
            <p>{paddock.name}</p>
            <p className="smText">PADDOCK 0{paddock.id}</p>

          </div>
          <div className="row02Data">
            <p>CAPACITY: 0{paddock.capacity}</p>
            <div className="row02DataInner">
              <p>ACTIVE: {paddock.available}</p>
              <div className="infoStatus" style={{ background: "#4eef4e" }}></div>
            </div>
          </div>

        </div>

      </div>
    </div>
  );
};

export default Paddock;
